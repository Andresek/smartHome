import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    void setCurrentRadioLimitValueZero() {
        Radio station = new Radio();

        station.setCurrentRadio(0);

        int expected = 0;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void setCurrentRadiolimitValueNine() {
        Radio station = new Radio();

        station.setCurrentRadio(9);

        int expected = 9;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void setCurrentRadioOverLimit() {
        Radio station = new Radio();

        station.setCurrentRadio(10);

        int expected = 0;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);

    }
}