package hass.katas.hundred_doors;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
        assertThrows(Exception.class, () -> game.getDoors().set(0, doorState));
    }
}