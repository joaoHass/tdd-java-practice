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
    @DisplayName("Every door should be open after first pass")
    void every_door_should_be_open_after_the_first_pass() {
        HundredDoorsGame game = new HundredDoorsGame();
        game.pass();
        for (Character door : game.getDoors()) {
            assertEquals('@', door);
        }
    }
}