package racinggame;

import org.junit.jupiter.api.Test;
import racinggame.utils.ValidationUtils;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationUtilsTest {

    @Test
    void valid_1() {
        assertThat(ValidationUtils.isValidNaming(new String[] {""})).isFalse();
    }

    @Test
    void valid_2() {
        assertThat(ValidationUtils.isValidNaming(new String[] {null})).isFalse();
    }

    @Test
    void valid_3() {
        assertThat(ValidationUtils.isValidNaming(new String[] {"", null})).isFalse();
    }

    @Test
    void valid_4() {
        assertThat(ValidationUtils.isValidNaming(new String[] {"chunSik", "ryan", "neo", "con", "muzi", "apeach", "jayG", "frodo", "tube"})).isFalse();
    }

    @Test
    void valid_5() {
        assertThat(ValidationUtils.isValidNaming(new String[] {"chunSik", "apeach"})).isFalse();
    }

    @Test
    void valid_6() {
        assertThat(ValidationUtils.isValidNaming(new String[] {"ryan", "neo", "con", "muzi", "jayG", "frodo", "tube"})).isTrue();
    }
}
