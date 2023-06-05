package hass.katas.hundred_doors;

public enum DoorStates {
    OPEN('@'),
    CLOSED('#');

    public final Character state;

    private DoorStates(Character state) {
        this.state = state;
    }
}
