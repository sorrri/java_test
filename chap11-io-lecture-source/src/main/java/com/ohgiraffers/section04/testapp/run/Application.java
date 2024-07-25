package com.ohgiraffers.section04.testapp.run;

/* aggregate(DTO, VO): 이벤트가 발생하고 그로인해 영향받는 데이터들 (자바에서 다루는 데이터 타입) */
/* run: 구동 + 화면 (화면, 입력공간, 출력공간 ( =view )) */
/* service: 로직 (성공/실패) */
/* repository: DB와 연관된 */
/* db(file) */

/* java application 켜자마자 일어날 일
 *   1. 관련된 객체들이 생성됨 (service, repository 객체들 생성)
 *   2. 파일에 저장된 회원 정보를 바로 load
 *  */

/* Service
* find (select)
* modify (update)
* remove (delete)
* regist (insert)
* */

import com.ohgiraffers.section04.testapp.aggregate.BloodType;
import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.service.MemberService;

import java.util.Scanner;

public class Application {

    private static final MemberService ms = new MemberService();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("======== 회원 관리 프로그램 ========");
            System.out.println("1. 모든 회원 정보 보기");
            System.out.println("2. 회원 찾기");
            System.out.println("3. 회원 가입");
            System.out.println("4. 로그인");
            System.out.println("5. 아이디 찾기");
            System.out.println("6. 회원 수정");
            System.out.println("7. 회원 탈퇴");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴를 선택해 주세요: ");
            int input = sc.nextInt();

            switch(input) {
                case 1:
                    ms.findAllMembers(); break;
                case 2:
                    ms.findMemberBy(chooseMemNo()); break;
                case 3:
                    ms.registMember(signUp()); break;
                case 4:
                    ms.loginMember(loginId(), loginPwd()); break;
                case 5:
                    ms.findMemberId(chooseMemEmail()); break;
                case 6:
                    Member selected = ms.findMemberMod(chooseMemNo());
                    if (selected == null) continue;
                    ms.modifyMember(reform(selected)); break;
                case 7:
                    ms.removeMember(chooseMemNo()); break;
                case 9:
                    System.out.println("회원관리 프로그램을 종료합니다."); return;
                default:
                    System.out.println("번호를 잘못 입력하셨습니다.");
            }
        }
    }

    private static Member signUp() {
        Member newMember = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력하세요: ");
        String id = sc.nextLine();

        System.out.print("패스워드를 입력하세요: ");
        String pwd = sc.nextLine();

        System.out.print("이메일을 입력하세요: ");
        String email = sc.nextLine();

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        System.out.print("입력할 취미 개수를 입력하세요(숫자로 1 이상): ");
        int length = sc.nextInt();
        sc.nextLine();                              // 버퍼의 개행문자 처리용

        String[] hobbies = new String[length];
        for(int i = 0; i < hobbies.length; i++) {
            System.out.print((i+1) + "번째 취미를 입력하세요.");
            String input = sc.nextLine();
            hobbies[i] = input;
        }

        System.out.print("혈액형을 입력하세요. (A, AB, B, O): ");
        String bloodType = sc.nextLine().toUpperCase();
        BloodType bt = null;
        switch(bloodType) {
            case "A":
                bt = BloodType.A; break;
            case "AB":
                bt = BloodType.AB; break;
            case "B":
                bt = BloodType.B; break;
            case "O":
                bt = BloodType.O;
        }

        /* 필기.
        *   회원으로부터 회원가입을 위한 정보를 입력받아 Member 타입 객체 하나로 가공처리할 방법이 두 가지 있다.
        *   1. 생성자 방식 (장: 한 줄 코딩 / 단: 따로 생성자 추가, 생성자의 매개변수가 다소 늘어날 수 있음 (리펙토링 참조))
        *   2. setter 방식 (장: 초기화 할 개수 수정 용이, 가독성이 좋음 / 단: 코드의 줄 수가 늘어남)
        * */
        newMember = new Member(id, pwd, email, age, hobbies);
        newMember.setBloodType(bt);

        return newMember;
    }

    private static Member reform(Member selected) {
        Member modifiedMember = selected;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("======== 회원 수정 관리 프로그램 ========");
            System.out.println("1. 비밀번호 수정");
            System.out.println("2. 이메일 수정");
            System.out.println("3. 나이 수정");
            System.out.println("4. 취미 수정");
            System.out.println("5. 혈액형 수정");
            System.out.println("6. 돌아가기");
            System.out.print("메뉴를 선택해 주세요: ");
            int input = sc.nextInt();
            sc.nextLine();

            switch(input) {
                case 1:
                    System.out.print("수정할 패스워드를 입력해주세요.");
                    modifiedMember.setPwd(sc.nextLine());
                    break;
                case 2:
                    System.out.print("수정할 이메일을 입력해주세요.");
                    modifiedMember.setEmail(sc.nextLine());
                    break;
                case 3:
                    System.out.print("수정할 나이를 입력해주세요.");
                    modifiedMember.setAge(sc.nextInt());
                    break;
                case 4:
                    modifiedMember.setHobbies(reformHobbies());
                    break;
                case 5:
                    modifiedMember.setBloodType(reformBloodType());

                case 6:
                    System.out.println("수정 관리 프로그램을 종료합니다.");
                    return selected;
                default:
                    System.out.println("번호를 잘못입력하셨습니다. 다시 입력해주세요.");

            }
            return modifiedMember;
        }
    }

    private static String[] reformHobbies() {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력할 취미 개수를 입력하세요(숫자로 1 이상): ");
        int length = sc.nextInt();
        sc.nextLine();                              // 버퍼의 개행문자 처리용

        String[] hobbies = new String[length];
        for(int i = 0; i < hobbies.length; i++) {
            System.out.print((i+1) + "번째 취미를 입력하세요.");
            String input = sc.nextLine();
            hobbies[i] = input;
        }
        return hobbies;
    }

    private static BloodType reformBloodType() {
        Scanner sc = new Scanner(System.in);
        System.out.print("혈액형을 입력하세요. (A, AB, B, O): ");
        String bloodType = sc.nextLine().toUpperCase();
        BloodType bt = null;
        switch(bloodType) {
            case "A":
                bt = BloodType.A; break;
            case "AB":
                bt = BloodType.AB; break;
            case "B":
                bt = BloodType.B; break;
            case "O":
                bt = BloodType.O;
        }
        return bt;
    }

    private static String loginId() {
        Scanner sc = new Scanner(System.in);
        System.out.print("회원님의 아이디를 입력해주세요: ");
        return sc.nextLine();
    }
    private static String loginPwd() {
        Scanner sc = new Scanner(System.in);
        System.out.print("회원님의 비밀번호를 입력해주세요: ");
        return sc.nextLine();
    }

    /* 설명. 회원 번호를 입력받아 반환하는 메소드 */

    private static int chooseMemNo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("회원의 번호를 입력하세요: ");
        return sc.nextInt();
    }

    private static String chooseMemEmail() {
        Scanner sc = new Scanner(System.in);
        System.out.print("찾으실 아이디의 이메일을 입력하세요: ");
        return sc.nextLine();
    }
}
