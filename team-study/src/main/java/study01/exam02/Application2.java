package study01.exam02;

/* 업다운 게임
*   - 1~100까지 주어진 랜덤한 값을 7회 안으로 맞춤
*   - 재시작 여부(1: 재시작, 0: 종료)
* */

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        gameStart();
    }

    public static void gameStart() {
        Scanner sc = new Scanner(System.in);
        boolean isSuccess = false;
        int reStart;

        while (true) {
            int randomNum = (int)(Math.random() * 100) + 1;

            for (int i = 0; i < 7; i++) {
                System.out.print("1~100까지 숫자를 입력하세요:");
                int userNum = sc.nextInt();

                if (userNum > randomNum) {
                    System.out.println("Down");
                } else if (userNum < randomNum) {
                    System.out.println("Up");
                } else {
                    System.out.println(userNum + ", 정답입니다.");
                    System.out.println(i + "번 안에 성공");
                    isSuccess = true;
                    break;
                }
            }
            if(isSuccess == false) {
                System.out.println("실패");
            }

            while(true) {
                System.out.print("게임을 재시작하시려면 1, 게임을 중단하시려면 0을 입력해주세요:");
                reStart = sc.nextInt();
                if (reStart == 0) {
                    System.out.println("게임을 종료합니다.");
                    return;
                } else if (reStart == 1) {
                    System.out.println("게임을 재시작합니다.");
                    break;
                } else {
                    System.out.println("잘못입력했습니다.");
                }
            }
        }
    }
}
