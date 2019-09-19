import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {
// 1 - Check that each status has an appropriate textual description, i.e. “Docked at home”, “Docked away”, and “On voyage...”.
// 2 - Create a container ship named Marco Polo launched on November 6 2012. It has a DWT of
// 187625 tonnes and can carry up to 16020 containers. It is empty and docked at home.

    @Test
    void checkENUMStatus(){
        assertTrue(ENUMstatus.HOME.toString() == "Docked at home");
        assertTrue(ENUMstatus.AWAY.toString() == "Docked away");
        assertTrue(ENUMstatus.VOYAGE.toString() == "On voyage...");
    }

    @Test
    void createContainerShip(){
        ContainerShip containerShip = new ContainerShip("Marco Polo", LocalDate.of(2012,Month.NOVEMBER,6),187625,16020, true, ENUMstatus.HOME);
        assertTrue(containerShip.getName() == "Marco Polo");
        assertTrue(containerShip.getLaunchDate().isEqual(LocalDate.of(2012, Month.NOVEMBER, 6)));
        assertTrue(containerShip.getDeadWeightTonnage() == 187625);
        assertTrue(containerShip.getContainerCount() == 16020);
        assertTrue(containerShip.isEmpty());
        assertTrue(containerShip.getStatus().toString() == ENUMstatus.HOME.toString());
    }
}