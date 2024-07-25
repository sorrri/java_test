package com.ohgiraffers.section04.testapp.service;

import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.repository.MemberRepository;

import java.util.ArrayList;

/* 설명. 트랜잭션 처리 (성공/실패에 따른 commit/rollback) 및 회원 관련 비즈니스 로직 처리 */
public class MemberService {

    private final MemberRepository mr = new MemberRepository();

    public MemberService() {
    }

    public void findAllMembers() {
        ArrayList<Member> findMembers = mr.selectAllMembers();

        for(Member member : findMembers) {
            System.out.println("member = " + member);
        }
    }

    public void findMemberBy(int memNo) {
        Member selectedMember = mr.selectMemberBy(memNo);

        if(selectedMember != null) {
            System.out.println("조회된 회원은: " + selectedMember.getId() + "아이디 회원");
        } else {
            System.out.println("조회된 회원 정보가 없습니다.");
        }
    }

    public void findMemberId(String memEmail) {
        Member selectedMember = mr.selectedMemberEmail(memEmail);

        if (selectedMember != null) {
            System.out.println("회원님의 아이디는 " + selectedMember.getId() + " 입니다.");
        } else {
            System.out.println("조회되는 아이디가 없습니다.");
        }
    }

    public Member findMemberMod(int memNo) {
        Member selectedMember = mr.selectMemberBy(memNo);

        if(selectedMember != null) {
            System.out.println("조회된 회원은: " + selectedMember.getId() + " 아이디 회원");
            return selectedMember;
        } else {
            System.out.println("조회된 회원 정보가 없습니다.");
        }
        return null;
    }

    public void loginMember(String memId, String memPwd) {
        Member selectedMember = mr.selectedMemberInfo(memId, memPwd);

        if(selectedMember != null) {
            System.out.println(selectedMember.getId() + " 회원님 로그인 되었습니다. 반갑습니다.");
        } else {
            System.out.println("비밀번호를 잘못 입력하였거나, 등록되지 않은 회원입니다.");
        }
    }

    public void registMember(Member newMember) {
        int lastMemberNo = mr.selectLastMemberNo();
        newMember.setMemNo(lastMemberNo + 1);
        int result = mr.insertMember(newMember);
//        System.out.println("성공/실패 유무 확인: " + result);
        if(result == 1) {
            System.out.println(newMember.getId() + "님 회원가입 해주셔서 감사합니다.");


            /* 설명. JDBC 이후에는 commit/rollback 처리도 할 예정 */
        }
    }

    public void removeMember(int removeMember) {
        int result = mr.deleteMember(removeMember);
        if(result == 1) {
            System.out.println("다시 돌아오세요");
            return;
        }
        System.out.println("회원번호를 잘못 적으셨습니다.");
    }

    public void modifyMember(Member reform) {
        int result = mr.updateMember(reform);
        if(result == 1) {
            System.out.println("정보가 수정되었습니다.");
            return;
        }
        System.out.println("수정내역이 없습니다.");
    }
}
