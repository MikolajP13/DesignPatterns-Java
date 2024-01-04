package behavioral.state;

public class Main {
    public static void main(String[] args) {
        Radio radio1 = new Radio();
        radio1.setOn(); // RadioNotPluggedState
        radio1.plugOut(); // RadioNotPluggedState
        radio1.plugIn(); // RadioNotPluggedState -> RadioPluggedState
        radio1.setOn(); // RadioPluggedState -> RadioOnState
        radio1.play(); // RadioOnState -> RadioPlayMusicState (playing default station no. 3)
        radio1.setPreviousRadioStation(); // RadioPlayMusicState
        radio1.play(); // RadioPlayMusicState
        radio1.setRadioStation(1); // RadioPlayMusicState
        radio1.setPreviousRadioStation(); // RadioPlayMusicState
        radio1.setNextRadioStation(); // RadioPlayMusicState
        radio1.setRadioStation(5); // RadioPlayMusicState
        radio1.play(); // RadioPlayMusicState
        radio1.setNextRadioStation(); // RadioPlayMusicState
        radio1.memorizeStation(5, 100.4); // RadioPlayMusicState
        radio1.memorizeStation(6, 112.4); // RadioPlayMusicState
        radio1.memorizeStation(6, 98.9); // RadioPlayMusicState
        radio1.setNextRadioStation(); // RadioPlayMusicState
        radio1.play(); // RadioPlayMusicState
        radio1.setOff(); // RadioPlayMusicState -> RadioOffState
        radio1.plugOut(); // RadioOffState -> RadioNotPluggedState

        System.out.println("=".repeat(15));
        Radio radio2 = new Radio();
        radio2.plugIn();
        radio2.play();
        radio2.setOn();
        radio2.play();
        radio2.plugOut();
    }
}
