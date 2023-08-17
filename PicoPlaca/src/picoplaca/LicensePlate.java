package picoplaca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public int getLastDigit() {
        return Character.getNumericValue(licensePlateNumber.charAt(licensePlateNumber.length() - 1));
    }

    //Method for determining whether a vehicle with a certain license plate is allowed on the road based on the day
    public boolean getDayRestriction(String day) {

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

    // Method for determining whether a vehicle with a certain license plate is allowed on the road based on the hour of the day
    public boolean getHourRestriction(String hour) {
        try {
            // Extract the time part (hours and minutes) from the input hour
            String time = hour.substring(0, hour.length() - 3);

            // Define the start and end times for the first time range
            String startTime1 = "07:00";
            String endTime1 = "09:30";

            // Define the start and end times for the second time range
            String startTime2 = "16:00";
            String endTime2 = "19:30";

            // Create a SimpleDateFormat object to parse time strings
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");

            // Parse the input time string into a Date object
            Date t = sdf.parse(time);

            // Parse the start and end times for the first range into Date objects
            Date s1 = sdf.parse(startTime1);
            Date e1 = sdf.parse(endTime1);

            // Parse the start and end times for the second range into Date objects
            Date s2 = sdf.parse(startTime2);
            Date e2 = sdf.parse(endTime2);

            // Check if the input time falls within the first time range
            if (t.compareTo(s1) >= 0 && t.compareTo(e1) <= 0) {
                return true; // The vehicle is not allowed on the road
            }

            // Check if the input time falls within the second time range
            if (t.compareTo(s2) >= 0 && t.compareTo(e2) <= 0) {
                return true; // The vehicle is not allowed on the road
            }

        } catch (ParseException ex) {
            Logger.getLogger(LicensePlate.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false; // The vehicle is allowed on the road during the specified hours
    }

    public String getResults(String day, String hour) {

        if (getDayRestriction(day)) {
            return "You can be on the road with no problem!";
        } else if (getHourRestriction(hour)) {
            return "YOU CAN'T BE ON THE ROAD FOR THE TIME BEING!";
        } else {
            return "You can be on the road with no problem at the specified time, but be aware of the time ranges (07:00-09:30 and 16:00-19:30)!";
        }
    }
}
