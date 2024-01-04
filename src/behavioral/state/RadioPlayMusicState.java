package behavioral.state;

public class RadioPlayMusicState implements RadioState {

    private final Radio radio;

    public RadioPlayMusicState(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void plugIn() {
        System.out.println("I am already plugged in, playing music!");
    }

    @Override
    public void plugOut() {
        System.out.println("Music stops! Plugged out!");
        radio.setCurrentState(radio.getNotPluggedState());
    }

    @Override
    public void setOn() {
        System.out.println("I am already set on, playing music!");
    }

    @Override
    public void setOff() {
        System.out.println("Radio turn off in a moment");
        radio.setCurrentState(radio.getOffState());
    }

    @Override
    public void setRadioStation(int radioStationNumber) {
        radio.selectRadioStation(radioStationNumber, radio);
    }

    @Override
    public void setNextRadioStation() {
        radio.nextRadioStation(radio);
    }

    @Override
    public void setPreviousRadioStation() {
        radio.previousRadioStation(radio);
    }


    @Override
    public void memorizeStation(int stationNumber, Double stationFrequency) {
        radio.addRadioStation(radio, stationNumber, stationFrequency);
    }

    @Override
    public void play() {
        System.out.println("Radio is playing music [" + radio.getDefaultStation() + "] [" + radio.getRadioStationMap().get(radio.getDefaultStation()) + "]");
    }
}
