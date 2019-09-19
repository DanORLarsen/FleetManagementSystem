import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {
// 1 -Check that each status has an appropriate textual description, i.e. “Docked at home”, “Docked away”, and “On voyage...”.


    @Test
    void checkENUMStatus(){
        assertTrue(ENUMstatus.HOME.toString() == "Docked at home");
        assertTrue(ENUMstatus.AWAY.toString() == "Docked away");
        assertTrue(ENUMstatus.VOYAGE.toString() == "On voyage...");
    }
}