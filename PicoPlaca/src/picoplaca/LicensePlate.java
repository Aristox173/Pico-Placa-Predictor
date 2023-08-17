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
    
    //Method to get the last digit of the license plate
    public char getLastDigit(){
        return licensePlateNumber.charAt(licensePlateNumber.length() - 1);
    }
    
}