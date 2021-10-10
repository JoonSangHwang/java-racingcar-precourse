package racinggame.model;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private final List<Car> racingPlayers;

    public Race(String[] carName) {
        this.racingPlayers = addRacer(carName);
    }

    private List<Car> addRacer(String[] carName) {
        List<Car> playerList = new ArrayList<>();

        for (String racingPlayer : carName) {
            playerList.add(new Car(racingPlayer));
        }

        return playerList;
    }

    public List<Car> getRacingPlayers() {
        return this.racingPlayers;
    }
}
