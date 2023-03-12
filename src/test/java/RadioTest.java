import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    void setCurrentRadioLimitValueZero() {
        Radio station = new Radio();

        station.setCurrentRadio(0, 10);

        int expected = 0;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void setCurrentRadiolimitValueNine() {
        Radio station = new Radio();

        station.setCurrentRadio(9, 10);

        int expected = 9;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void setCurrentRadioOverNine() {
        Radio station = new Radio();

        station.setCurrentRadio(10, 10);

        int expected = 0;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void setCurrentRadioUnderZero() {
        Radio station = new Radio();

        station.setCurrentRadio(-1, 10);

        int expected = 0;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void nextRadioAfterNineStation() {
        Radio station = new Radio();
        station.setCurrentRadio(9, 10);

        station.next();

        int expected = 0;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextRadioUnderNineStation() {
        Radio station = new Radio();
        station.setCurrentRadio(8, 10);

        station.next();

        int expected = 9;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevRadioAfterZeroStation() {
        Radio station = new Radio();
        station.setCurrentRadio(1, 10);

        station.prev();

        int expected = 0;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevRadioUnderZeroStation() {
        Radio station = new Radio();
        station.setCurrentRadio(0, 10);

        station.prev();

        int expected = 9;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setVolumeAboveHundred() {
        Radio volume = new Radio();
        volume.setToMaxVolume();

        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();
    }

    @Test
    void setVolumeUnderZero() {
        Radio volume = new Radio();
        volume.setToMinVolume();

        volume.reduceVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();
    }

    @Test
    void setVolumeBetweenZeroAndHundredIncreaseVolume() {
        Radio volume = new Radio();
        volume.setToMinVolume();

        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getCurrentVolume();
    }

    @Test
    void setVolumeBetweenZeroAndHundredReduceVolume() {
        Radio volume = new Radio();
        volume.setToMaxVolume();

        volume.reduceVolume();

        int expected = 99;
        int actual = volume.getCurrentVolume();
    }

    @Test
    void setNumberStation() {
        Radio station = new Radio(20);

        station.setCurrentRadio(15, 20);

        int expected = 0;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }


}



