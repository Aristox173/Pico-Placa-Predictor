# Pico y Placa Predictor
Pico y Placa Predictor is a Java-based system that determines whether a car can be on the road based on the last digit of the license plate, the day of the week, and the time of day.
## Description
Pico y Placa Predictor is designed to provide users with information about whether a vehicle with a specific license plate number is allowed to be on the road at a given day and time. The prediction is based on the Pico y Placa regulations, which restrict vehicles with certain license plate numbers during specific days and hours.

The system includes a graphical user interface (GUI) that allows users to enter the license plate number, select the day of the week, and specify the time. The system then provides a prediction indicating whether the vehicle can be on the road during the specified conditions.

## Features
* User-friendly graphical user interface (GUI).
* Input validation for license plate numbers and times.
* Day-based and hour-based restrictions for road access.
* Real-time prediction of road access based on user input.

## Installation
To use the Pico y Placa Predictor, follow these steps:
1. Clone or download the repository to your local machine.
2. Open the project in your preferred Java IDE (Integrated Development Environment).
3. Build and run the project to launch the GUI.
* The project includes external dependencies. Ensure that these dependencies are properly imported and configured in your IDE.

## Usage
1. Launch the Pico y Placa Predictor application.
2. Enter the license plate number by inputting the first three letters and the last three or four digits separately.
3. Select the day of the week from the dropdown menu.
4. Use the time picker to choose the time for the prediction.
5. Click the "PREDICT" button to receive the prediction result.
6. The prediction result will indicate whether the vehicle can be on the road based on the entered information. The application will display messages such as "You can be on the road with no problem!" or "YOU CAN'T BE ON THE ROAD FOR THE TIME BEING!" depending on the conditions.

# NOTES
* Developed in Apache Netbeans IDE 18
* JDK 19
* Libraries used: TimingFramework-0.55.jar and swing-time-picker.jar
* Link to the libraries: https://github.com/DJ-Raven/java-swing-timepicker/tree/main/lib
