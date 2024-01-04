package behavioral.state;

public interface RadioState {
    void plugIn();
    void plugOut();
    void setOn();
    void setOff();
    void setRadioStation(int radioStationNumber);
    void setNextRadioStation();
    void setPreviousRadioStation();
    void memorizeStation(int stationNumber, Double stationFrequency);
    void play();
}
