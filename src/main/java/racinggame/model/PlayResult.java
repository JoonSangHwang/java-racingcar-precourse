package racinggame.model;

import java.util.List;
import java.util.stream.Collectors;

public class PlayResult {

    private static String winner;

    public static void winnerCheck(List<Car> racingPlayer, int winnerNum) {
        winner = racingPlayer.stream()
                .filter(player -> player.getCurStep() == winnerNum)
                .map(Car::getName)
                .collect(Collectors.joining(","));
    }

    public static String getWinner() {
        return winner;
    }
}
