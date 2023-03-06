
public class Radio {
    private int currentRadio;
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }


    public int getCurrentRadio() {
        return currentRadio;
    }

    public void next() {
        if (currentRadio == 9) {
            currentRadio = 0;
        } else currentRadio = currentRadio + 1;
    }

    public void prev() {
        if (currentRadio == 0) {
            currentRadio = 9;
        } else currentRadio = currentRadio - 1;
    }

    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio < 0) {
            return;
        }
        if (newCurrentRadio > 9) {
            return;
        }
        currentRadio = newCurrentRadio;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

}