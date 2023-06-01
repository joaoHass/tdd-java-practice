package hass.katas.hundred_doors;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HundredDoorsTest {

    @Test
    @DisplayName("Should return true if all doors are closed")
    void testAllDoorsAreClosed_ShouldAssert_True() {
        HundredDoorsGame game = new HundredDoorsGame();
        for (Character door : game.getDoors()) {
            assertEquals('#', door);
        }
    }

    @Test
    @DisplayName("Asserts that doors can only be set open/closed")
    void testDoorStates_CanOnlyBe_OpenClosed() {
        HundredDoorsGame game = new HundredDoorsGame();

        char doorState = 'a';
        assertThrows(IllegalArgumentException.class, () -> game.setDoorState(0, doorState));

        List<Character> gameDoorsList = game.getDoors();
        gameDoorsList.set(0, doorState);
        assertNotEquals(gameDoorsList, game.getDoors());
    }
}