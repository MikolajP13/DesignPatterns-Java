package behavioral.state;

import java.util.HashMap;
import java.util.Map;

public class Radio {
    private final RadioState notPluggedState;
    private final RadioState pluggedState;
    private final RadioState offState;
    private final RadioState onState;
    private final RadioState playMusicState;
    private RadioState currentState;
    private int defaultStation = 3;
    private Map<Integer, Double> radioStationMap;

    public Radio() {
        this.notPluggedState = new RadioNotPluggedState(this);
        this.pluggedState = new RadioPluggedState(this);
        this.offState = new RadioOffState(this);
        this.onState = new RadioOnState(this);
        this.playMusicState = new RadioPlayMusicState(this);

        this.currentState = this.notPluggedState;

        radioStationMap = new HashMap<>();
        radioStationMap.put(1, 88.9);
        radioStationMap.put(2, 90.5);
        radioStationMap.put(3, 95.9);
        radioStationMap.put(4, 99.7);
        radioStationMap.put(5, 102.4);
    }

    public void plugIn() {
        this.currentState.plugIn();
    }
    public void plugOut() {
        this.currentState.plugOut();
    }
    public void setOn() {
        this.currentState.setOn();
    }
    public void setOff() {
        this.currentState.setOff();
    }
    public void setRadioStation(int radioStationNumber) {
        this.currentState.setRadioStation(radioStationNumber);
    }
    public void setNextRadioStation() {
        this.currentState.setNextRadioStation();
    }
    public void setPreviousRadioStation() {
        this.currentState.setPreviousRadioStation();
    }
    public void memorizeStation(int stationNumber, double stationFrequency) {
        this.currentState.memorizeStation(stationNumber, stationFrequency);
    }
    public void play() {
        this.currentState.play();
    }

    public void setDefaultStation(int defaultStation) {
        this.defaultStation = defaultStation;
    }

    public int getDefaultStation() {
        return defaultStation;
    }

    public RadioState getNotPluggedState() {
        return notPluggedState;
    }

    public RadioState getPluggedState() {
        return pluggedState;
    }

    public RadioState getOffState() {
        return offState;
    }

    public RadioState getOnState() {
        return onState;
    }

    public RadioState getPlayMusicState() {
        return playMusicState;
    }

    public void setCurrentState(RadioState currentState) {
        this.currentState = currentState;
    }

    public RadioState getCurrentState() {
        return currentState;
    }

    public Map<Integer, Double> getRadioStationMap() {
        return radioStationMap;
    }

    public void selectRadioStation(int radioStationNumber, Radio radio) {
        if (radio.getRadioStationMap().get(radioStationNumber) == null){
            System.out.println("Invalid station number! Available list below: ");
            radio.getRadioStationMap().forEach((k, v) -> System.out.println("Nr: " + k + ", frequency: " + v));
        } else {
            System.out.println("Good choice: [" + radioStationNumber + "] [" + radio.getRadioStationMap().get(radioStationNumber) + " FM] | Playing music");
            radio.setDefaultStation(radioStationNumber);
            radio.setCurrentState(radio.getPlayMusicState());
        }
    }

    public void addRadioStation(Radio radio, int stationNumber, double stationFrequency) {
        if (stationFrequency < 88.00 || stationFrequency > 108.00) {
            System.out.println("Invalid frequency (" + stationFrequency +")! Must be between 88.00 - 108.00");
        } else if (radio.getRadioStationMap().get(stationNumber) != null) {
            System.out.println("Station (" + stationNumber + ") exists!");
        } else {
            this.radioStationMap.put(stationNumber, stationFrequency);
            System.out.printf("You have been added a new station no. %d / %.2f!\n", stationNumber, stationFrequency);
        }
    }

    public void nextRadioStation(Radio radio) {
        int currentStationNumber = radio.getDefaultStation();

        if (currentStationNumber + 1 > radio.getRadioStationMap().size()) {
            System.out.println("No more stations, only previous stations are available");
        } else {
            radio.setDefaultStation(currentStationNumber + 1);
            System.out.println("Next station [" + radio.getDefaultStation() + "] [" + radio.getRadioStationMap().get(radio.getDefaultStation()) + "] Playing music");
            radio.setCurrentState(radio.getPlayMusicState());
        }
    }

    public void previousRadioStation(Radio radio) {
        int currentStationNumber = radio.getDefaultStation();

        if (currentStationNumber - 1  < 1) {
            System.out.println("No more stations, only next stations are available");
        } else {
            radio.setDefaultStation(currentStationNumber - 1);
            System.out.println("Previous station [" + radio.getDefaultStation() + "] [" + radio.getRadioStationMap().get(radio.getDefaultStation()) + "] Playing music");
            radio.setCurrentState(radio.getPlayMusicState());
        }
    }
}
