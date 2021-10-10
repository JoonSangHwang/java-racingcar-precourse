package racinggame.view;

import racinggame.model.Car;
import racinggame.model.PlayResult;

public class OutputView {

    public static void printWinner() {
        System.out.println("최종 우승자는 " + PlayResult.getWinner() + " 입니다.");
    }

    public static void printRacingContent(Car racingPlayer) {

        String name = racingPlayer.getName();
        int step = racingPlayer.getCurStep();

        System.out.println(name + " : " + stepToHyphen(step));
    }

    private static String stepToHyphen(int step) {

        StringBuffer sb = new StringBuffer();
        for (int i=0; i<step; i++) {
            sb.append("-");
        }

        return String.valueOf(sb);
    }
}
