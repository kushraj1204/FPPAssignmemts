package Program2;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {

    private static final int RHR = 70;
    private static final double LB = 0.5;
    private static final double UB = 0.85;
    private static final int MAXRATE = 220;
    private String name;
    private String lastName;
    private LocalDate dateOfBirth;

    public HeartRates(String name, String lastName, LocalDate dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public Period calculateAge() {
        AgeCalculator ageCalculator = new AgeCalculator();
        return ageCalculator.calculateAge(dateOfBirth);
    }
    public int calculateAgeInYears() {
        return calculateAge().getYears();
    }

    public int calculateMaxHeartRate() {
        return MAXRATE - calculateAgeInYears();
    }

    public double[] calculateTargetHeartRate() {
        double averageHeartRate=(calculateMaxHeartRate())-RHR;
        double lowerBoundaryTargetHeartRate =  ((averageHeartRate * LB) + RHR);
        double upperBoundaryTargetHeartRate =  ((averageHeartRate * UB) + RHR);
        return new double[]{lowerBoundaryTargetHeartRate, upperBoundaryTargetHeartRate};
    }

    @Override
    public String toString() {
        return "  name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth= " + dateOfBirth +
                ", age(in yrs)= " + calculateAgeInYears() +
                ", maximum heart rate(MHR)= " + calculateMaxHeartRate() +
                '}';
    }
}
