package racinggame.view;

import nextstep.utils.Console;
import racinggame.utils.ValidationUtils;

public class InputView {
    public static String[] inputCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

        String[] names = Console.readLine().split(",");

        if (!ValidationUtils.isValidNaming(names)) {
            throw new IllegalArgumentException("[ERROR] 입력이 잘 못 되었습니다.");
        }

        return names;
    }

    public static int inputRacingRoundCnt() {

        System.out.println("시도할 회수는 몇회인가요?");
        return Integer.parseInt(Console.readLine());
    }
}
