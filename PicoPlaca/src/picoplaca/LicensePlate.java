package picoplaca;

/**
 *
 * @author Juan Aristizábal
 */

public class LicensePlate {
    //Attributes
    private String licensePlateNumber;

    //Constructor
    public LicensePlate(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    //Setters
    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    //Getters
    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }
    
}