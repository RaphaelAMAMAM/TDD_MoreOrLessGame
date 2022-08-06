import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MoreOrLessSystemTest {

    MoreOrLessSystem moreOrLessSystem = new MoreOrLessSystem(100, 10, 50);

    @Test
    void shouldReturnTrueWhenUserNumberIsEqualToNumberToFind() {
        int userNumber = 50;
        boolean isAMatch = moreOrLessSystem.checkNumber(userNumber);
        assertThat(isAMatch).isTrue();
    }

    @Test
    void shouldReturnTrueWhenSecretNumberIsBiggerThanUserNumber() {
        int userNumber = 49;
        boolean isBigger = moreOrLessSystem.getIfSecretNumberIsBigger(userNumber);
        assertThat(isBigger).isTrue();
    }

    @Test
    void shouldReturnThreeWhenWeTriedSevenTimesAndMaxTriesIsTen() {
        int numberTries = 7;
        int remainingTries = moreOrLessSystem.calculRemainingTries(numberTries);
        assertThat(remainingTries).isEqualTo(3);
    }
}