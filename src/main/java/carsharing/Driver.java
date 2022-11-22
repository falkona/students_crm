package carsharing;

public class Driver {

    private String fullName;
    private String drivingLicence;

    public Driver(String fullName, String drivingLicence) {
        this.fullName = fullName;
        this.drivingLicence = drivingLicence;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDrivingLicence() {
        return drivingLicence;
    }

    public void setDrivingLicence(String drivingLicence) {
        this.drivingLicence = drivingLicence;
    }

}
