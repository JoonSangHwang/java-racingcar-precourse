package racinggame.controller;

import nextstep.utils.Randoms;
import racinggame.model.Car;
import racinggame.model.PlayResult;
import racinggame.model.Race;
import racinggame.view.InputView;
import racinggame.view.OutputView;

import java.util.List;

public class RacingController {

    private List<Car> racingPlayers;

    public void game() {
        gameReadey();

        int winnerNum = gameStart();

        gameEnd(winnerNum);
    }

    private void gameReadey() {
        String[] carName;
        try {
            carName = InputView.inputCarName();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        Race racing = new Race(carName);
        racingPlayers = racing.getRacingPlayers();
    }

    private int gameStart() {
        int round = InputView.inputRacingRoundCnt();
        int winnerNum = 0;

        while (round-- > 0) {

            for (Car racingPlayer : racingPlayers) {
                racingPlayer.play(Randoms.pickNumberInRange(1,9));

                OutputView.printRacingContent(racingPlayer);

                if (winnerNum < racingPlayer.getCurStep())
                    winnerNum = racingPlayer.getCurStep();

            }
            System.out.println();
        }

        return winnerNum;
    }

    private void gameEnd(int winnerNum) {
        PlayResult.winnerCheck(racingPlayers, winnerNum);
        OutputView.printWinner();
    }
}
