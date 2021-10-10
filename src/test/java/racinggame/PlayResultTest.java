package racinggame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racinggame.model.Car;
import racinggame.model.PlayResult;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PlayResultTest {

    private List<Car> racingPlayers = new ArrayList<>();
    private Car ryan, neo, con, muzi;

    @BeforeEach
    void setup() {
        ryan    = new Car("RYAN");
        neo     = new Car("NEO");
        con     = new Car("CON");
        muzi    = new Car("MUZI");

        ryan.play(9);   ryan.play(9);   ryan.play(9);
        neo.play(9);    neo.play(9);    neo.play(9);
        con.play(9);    con.play(9);    con.play(2);
        muzi.play(4);   muzi.play(1);   muzi.play(2);

        racingPlayers.add(ryan);
        racingPlayers.add(neo);
        racingPlayers.add(con);
        racingPlayers.add(muzi);
    }

    @Test
    public void winnerCheck() {
        PlayResult.winnerCheck(racingPlayers, 3);
        assertThat(PlayResult.getWinner()).isEqualTo("RYAN,NEO");
    }

}