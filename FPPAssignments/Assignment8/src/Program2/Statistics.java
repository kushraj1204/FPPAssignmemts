package Program2;

import java.util.*;

public class Statistics {

    public static double computeSumOfSalaries(List<EmployeeData> aList) {
        double totalSalary = 0;
        for (EmployeeData employeeData : aList) {
            totalSalary = totalSalary + employeeData.getSalary();
        }
        return totalSalary;

    }
}
