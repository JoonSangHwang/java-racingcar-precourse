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
    private int winnerStep = 0;

    public void game() {
        gameReadey();

        gameStart();

        gameEnd();
    }

    private void gameReadey() {
        String[] carName;
        try {
            carName = InputView.inputCarName();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        racingPlayers = new Race(carName).getRacingPlayers();
    }

    private void gameStart() {
        int round = InputView.inputRacingRoundCnt();

        while (round-- > 0) {
            inProgress();
        }
    }

    private void inProgress() {
        for (Car racingPlayer : racingPlayers) {
            racingPlayer.play(Randoms.pickNumberInRange(1,9));

            OutputView.printRacingContent(racingPlayer);

            winnerStep = Math.max(winnerStep, racingPlayer.getCurStep());
        }
        System.out.println();
    }

    private void gameEnd() {
        PlayResult.winnerCheck(racingPlayers, winnerStep);
        OutputView.printWinner();
    }
}
