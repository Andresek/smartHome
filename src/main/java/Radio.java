
public class Radio {
    private int currentRadio;
    private int currentVolume;

    private int numberStation;

    public Radio() {
        numberStation = 10; // установка количества радиостанций по умолчанию
    }

    public Radio(int numberStation) {

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadio() {
        return currentRadio;
    }

    public void next() {
        if (currentRadio == numberStation - 1) {
            currentRadio = 0;
        } else {
            currentRadio = currentRadio + 1;
        }
    }

    public void prev() {
        if (currentRadio == 0) {
            currentRadio = numberStation - 1;
        } else {
            currentRadio = currentRadio - 1;
        }
    }

    public void setCurrentRadio(int newCurrentRadio, int numberStation) {
        if (newCurrentRadio < 0) {
            return;
        }
        if (newCurrentRadio > numberStation - 1) {
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