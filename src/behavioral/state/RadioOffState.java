package behavioral.state;

public class RadioOffState implements RadioState {

    private final Radio radio;

    public RadioOffState(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void plugIn() {
        System.out.println("I am already plugged in!");
    }

    @Override
    public void plugOut() {
        System.out.println("Radio plugged out!");
        radio.setCurrentState(radio.getNotPluggedState());
    }

    @Override
    public void setOn() {
        System.out.println("Radio is setting on...");
    }

    @Override
    public void setOff() {
        System.out.println("I am already off!");
    }

    @Override
    public void setRadioStation(int radioStationNumber) {
        System.out.println("Turn me on to set radio station");
    }

    @Override
    public void setNextRadioStation() {
        System.out.println("Turn me on to set next radio station");
    }

    @Override
    public void setPreviousRadioStation() {
        System.out.println("Turn me on to set previous radio station");
    }

    @Override
    public void memorizeStation(int stationNumber, Double stationFrequency) {
        System.out.println("Turn me on to add radio station");
    }

    @Override
    public void play() {
        System.out.println("Turn me on and select radio station to listen to music!");
    }
}
