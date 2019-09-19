import java.time.LocalDate;

public class ContainerShip extends Freighter {
    private int containerCount;

    public ContainerShip(String name, LocalDate launchDate, int deadWeightTonnage, int carryContainerCount, boolean isEmpty, ENUMstatus status) {
        super(name, launchDate, deadWeightTonnage, isEmpty, status);
        containerCount = carryContainerCount;
    }

    public int getContainerCount() {
        return containerCount;
    }

    public void setContainerCount(int containerCount) {
        this.containerCount = containerCount;
    }
}
