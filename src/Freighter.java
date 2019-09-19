import java.time.LocalDate;

public class Freighter {
private String name;
private LocalDate launchDate;
private int deadWeightTonnage;
private boolean isEmpty;
private ENUMstatus status;

    public Freighter(String name, LocalDate launchDate, int deadWeightTonnage, boolean isEmpty, ENUMstatus status) {
        this.name = name;
        this.launchDate = launchDate;
        this.deadWeightTonnage = deadWeightTonnage;
        this.isEmpty = isEmpty;
        this.status = status;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public ENUMstatus getStatus() {
        return status;
    }

    public void setStatus(ENUMstatus status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(LocalDate launchDate) {
        this.launchDate = launchDate;
    }

    public int getDeadWeightTonnage() {
        return deadWeightTonnage;
    }

    public void setDeadWeightTonnage(int deadWeightTonnage) {
        this.deadWeightTonnage = deadWeightTonnage;
    }
}
