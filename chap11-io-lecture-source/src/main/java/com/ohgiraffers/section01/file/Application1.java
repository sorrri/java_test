package com.ohgiraffers.section01.file;

/* 수업목표. File 클래스의 사용 용법을 이해할 수 있다. */

import java.io.File;
import java.io.IOException;

public class Application1 {
    public static void main(String[] args) {
        File file = new File("src\\main\\java\\com\\ohgiraffers\\section01\\file\\test.txt");

        try {
            boolean isSuccess = file.createNewFile();
            System.out.println("파일 생성 여부: " + isSuccess);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /* 설명. 몇 가지 File에서 제공하는 메소드 확인 */
        System.out.println("파일의 크기: " + file.length() + "byte");
        System.out.println("파일의 경로: " + file.getPath());
        System.out.println("현재 파일의 상위 경로: " + file.getParent());
        System.out.println("파일의 절대 경로: " + file.getAbsolutePath());

        boolean isDeleted = file.delete();
        System.out.println("파일 삭제 여부: " + isDeleted);
    }
}
