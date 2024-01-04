package behavioral.state;

public class RadioNotPluggedState implements RadioState{

    private final Radio radio;

    public RadioNotPluggedState(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void plugIn() {
        System.out.println("I have been plugged in! Starting... Wait for a second...");
        radio.setCurrentState(radio.getPluggedState());
    }

    @Override
    public void plugOut() {
        System.out.println("I am already plugged out!");
    }

    @Override
    public void setOn() {
        System.out.println("Without electricity I can not do anything :(");
    }

    @Override
    public void setOff() {
        System.out.println("Without electricity I can not do anything :(");
    }

    @Override
    public void setRadioStation(int radioStationNumber) {
        System.out.println("Without electricity I can not do anything :(");
    }

    @Override
    public void setNextRadioStation() {
        System.out.println("Without electricity I can not do anything :(");
    }

    @Override
    public void setPreviousRadioStation() {
        System.out.println("Without electricity I can not do anything :(");
    }

    @Override
    public void memorizeStation(int stationNumber, Double stationFrequency) {
        System.out.println("Without electricity I can not do anything :(");
    }

    @Override
    public void play() {
        System.out.println("Without electricity I can not do anything :(");
    }
}
