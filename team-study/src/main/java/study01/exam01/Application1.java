package study01.exam01;

/* 주사위 게임
*   - 1부터 6까지 랜덤한 값으로 유저와 컴퓨터 값 비교
*   - 우승, 무승부, 패배
*   - 재시작 x
* */

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        playDice();
    }

    public static void playDice() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("주사위 게임을 시작합니다: ");
            String start = sc.nextLine();
            int myDice = (int)(Math.random() * 6) + 1;
            System.out.println("당신의 주사위는 " + myDice + "입니다. 한 번 더 눌러주세요. ");
            start = sc.nextLine();

            int comDice = (int)(Math.random() * 6) + 1;
            System.out.println("컴퓨터의 주사위는 " + comDice + "입니다.");

            if (myDice > comDice) {
                System.out.println("당신이 이겼습니다.");
                break;
            } else if (myDice == comDice) {
                System.out.println("무승부입니다.");
                break;
            } else {
                System.out.println("컴퓨터가 이겼습니다.");
                break;
            }
        }

    }
}
