package Program2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName=sc.nextLine();

        System.out.println("Please enter your last name");
        String lastName=sc.nextLine();

        AgeCalculator ageCalculator = new AgeCalculator();
        LocalDate dob =ageCalculator.getBirthday();

        HeartRates heartRates=new HeartRates(firstName,lastName,dob);
        double[] targetRates= heartRates.calculateTargetHeartRate();

        System.out.println("The target heart rate is between "+targetRates[0]+" and "+targetRates[1]);
        System.out.println("First Name: "+heartRates.getName());
        System.out.println("Last Name: "+heartRates.getLastName());
        System.out.println("Age: "+heartRates.calculateAgeInYears());
        System.out.println("Date of Birth: "+heartRates.getDateOfBirth());
        System.out.println("Maximum Heart Rate: "+heartRates.calculateMaxHeartRate());
    }
}
