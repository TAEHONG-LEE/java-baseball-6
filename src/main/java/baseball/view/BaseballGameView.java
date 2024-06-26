package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class BaseballGameView {

    // input view
    public static String setUserNumber() {
        System.out.println("숫자를 입력해주세요 : ");
        return Console.readLine();
    }

    public static String setRetryNumber() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        return Console.readLine();
    }


    // output view
    public static void printBaseballGameStart() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void printBallStrikeMessage() {
        System.out.print("볼 ");
    }

    public static void printBallMessage() {
        System.out.println("볼");
    }

    public static void printStrikeMessage() {
        System.out.println("스트라이크");
    }

    public static void printNothingMessage() {
        System.out.println("낫싱");
    }

    public static void printCount(int count) {
        System.out.print(count);
    }

    public static void printBaseballGameEndMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}