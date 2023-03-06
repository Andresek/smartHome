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
    void setCurrentRadioOverNine() {
        Radio station = new Radio();

        station.setCurrentRadio(10);

        int expected = 0;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void setCurrentRadioUndoZero() {
        Radio station = new Radio();

        station.setCurrentRadio(-1);

        int expected = 0;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void nextRadioAfterNineStation() {
        Radio station = new Radio();
        station.setCurrentRadio(9);

        station.next();

        int expected = 0;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextRadioUndoNineStation() {
        Radio station = new Radio();
        station.setCurrentRadio(8);

        station.next();

        int expected = 9;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevRadioAfterZeroStation() {
        Radio station = new Radio();
        station.setCurrentRadio(1);

        station.prev();

        int expected = 0;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevRadioUndoZeroStation() {
        Radio station = new Radio();
        station.setCurrentRadio(0);

        station.prev();

        int expected = 9;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }



}