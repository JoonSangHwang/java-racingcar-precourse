package racinggame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racinggame.model.Car;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private Car chunSik, ryan, neo, con, muzi, apeach, jayG, frodo, tube;

    @BeforeEach
    void setup() {
        chunSik = new Car("CHUN-SIK");
        ryan    = new Car("RYAN");
        neo     = new Car("NEO");
        con     = new Car("CON");
        muzi    = new Car("MUZI");
        apeach  = new Car("APEACH");
        jayG    = new Car("JAY-G");
        frodo   = new Car("FRODO");
        tube    = new Car("TUBE");
    }

    @Test
    void 레이싱() {
        chunSik.play(1);
        ryan   .play(2);
        neo    .play(3);
        con    .play(4);
        muzi   .play(5);
        apeach .play(6);
        jayG   .play(7);
        frodo  .play(8);
        tube   .play(9);

        assertThat(chunSik.getCurStep()).isEqualTo(0);
        assertThat(ryan   .getCurStep()).isEqualTo(0);
        assertThat(neo    .getCurStep()).isEqualTo(0);
        assertThat(con    .getCurStep()).isEqualTo(1);  // 4부터는 전진하여 Step: 1
        assertThat(muzi   .getCurStep()).isEqualTo(1);
        assertThat(apeach .getCurStep()).isEqualTo(1);
        assertThat(jayG   .getCurStep()).isEqualTo(1);
        assertThat(frodo  .getCurStep()).isEqualTo(1);
        assertThat(tube   .getCurStep()).isEqualTo(1);
    }
}
