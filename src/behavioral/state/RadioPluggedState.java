package behavioral.state;

public class RadioPluggedState implements RadioState {

    private final Radio radio;

    public RadioPluggedState(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void plugIn() {
        System.out.println("I am already plugged in!");
    }

    @Override
    public void plugOut() {
        System.out.println("You plugged me out, I am out of electricity...");
        radio.setCurrentState(radio.getNotPluggedState());
    }

    @Override
    public void setOn() {
        System.out.println("Welcome listener!");
        radio.setCurrentState(radio.getOnState());
    }

    @Override
    public void setOff() {
        System.out.println("Goodbye listener!");
        radio.setCurrentState(radio.getOffState());
    }

    @Override
    public void setRadioStation(int radioStationNumber) {
        System.out.println("Turn me on before you set radio station :)");
    }

    @Override
    public void setNextRadioStation() {
        System.out.println("Turn me on before you set next radio station :)");
    }

    @Override
    public void setPreviousRadioStation() {
        System.out.println("Turn me on before you set previous radios station :)");
    }

    @Override
    public void memorizeStation(int stationNumber, Double stationFrequency) {
        System.out.println("Turn me on before you try to add new radio station :)");
    }

    @Override
    public void play() {
        System.out.println("Turn me on before set play :)");
    }
}
