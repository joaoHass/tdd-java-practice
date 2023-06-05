package hass.katas.hundred_doors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HundredDoorsGame {
    private List<Character> doors = Arrays.asList(new Character[100]);
    private Integer _numberOfPasses = 0;

    public HundredDoorsGame() {
        Collections.fill(doors, '#');
    }

    public List<Character> getDoors() {
        return new ArrayList<>(this.doors);
    }

    public void setDoorState(int doorNumber, DoorStates doorState) {
            doors.set(doorNumber, doorState.state);
    }

    public void setDoors(List<Character> doors) {
        this.doors = doors;
    }

    public void pass() {
        for (int i = 0; i < doors.size(); i++) {
            doors.set(i, DoorStates.OPEN.state);
        }
    }
}
