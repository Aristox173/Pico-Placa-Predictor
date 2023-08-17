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
    public int getLastDigit(){
        return Character.getNumericValue(licensePlateNumber.charAt(licensePlateNumber.length() - 1));
    }
    
    public boolean getDayRestriction(String day){
        
        //Get the last digit of the license plate
        int lastDigit = getLastDigit();
        
        switch (day) {
            case "Monday":
                // If the last digit of the license plate is not 1 and not 2,
                // the vehicle is allowed on Monday.
                return lastDigit != 1 && lastDigit != 2;
            case "Tuesday":
                // If the last digit of the license plate is not 3 and not 4,
                // the vehicle is allowed on Tuesday.
                return lastDigit != 3 && lastDigit != 4;
            case "Wednesday":
                // If the last digit of the license plate is not 5 and not 6,
                // the vehicle is allowed on Wednesday.
                return lastDigit != 5 && lastDigit != 6;
            case "Thursday":
                // If the last digit of the license plate is not 7 and not 8,
                // the vehicle is allowed on Thursday.
                return lastDigit != 7 && lastDigit != 8;
            case "Friday":
                // If the last digit of the license plate is not 9 and not 0,
                // the vehicle is allowed on Friday.
                return lastDigit != 9 && lastDigit != 0;
            default:
                return true;
        }
    }
}