
public class Radio {
    private int currentRadio;

    public int getCurrentRadio() {
        return currentRadio;
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
}