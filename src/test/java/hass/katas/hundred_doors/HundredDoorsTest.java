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
}