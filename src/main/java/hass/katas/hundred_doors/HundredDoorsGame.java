package hass.katas.hundred_doors;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HundredDoorsGame {
    private List<Character> doors = Arrays.asList(new Character[100]);

    public HundredDoorsGame() {
        Collections.fill(doors, '#');
    }

    public List<Character> getDoors() {
        return doors;
    }

    public void setDoors(List<Character> doors) {
        this.doors = doors;
    }
}
