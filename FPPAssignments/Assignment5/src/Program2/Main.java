package Program2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Professor[] professors=new Professor[3];
        professors[0]=new Professor("Rod",90000,2000,3,12,10);
        professors[1]=new Professor("Patrick",75000,2000,6,21,10);
        professors[2]=new Professor("Marie",120000,1999,8,4,10);

        Secretary[] secretaries=new Secretary[2];
        secretaries[0]=new Secretary("Bryan",70000,1998,2,7,4.5);
        secretaries[1]=new Secretary("Daniel",85000,2016,10,27,20);

        DeptEmployee[] deptEmployees=new DeptEmployee[5];
        System.arraycopy(professors,0,deptEmployees,0,professors.length);
        System.arraycopy(secretaries,0,deptEmployees,professors.length,secretaries.length);

        Scanner sc=new Scanner(System.in);
        System.out.println("Do you want to see the sum of all the salaries int the department? Press Y to see. ");
        String response=sc.nextLine();
        if ("Y".equalsIgnoreCase(response)){
            double totalSalaries=0;
            for (DeptEmployee emp:deptEmployees){
                totalSalaries=totalSalaries+emp.computeSalary();
            }
            System.out.println("The total salary sum is: "+totalSalaries);
        }
        else{
            System.out.println("Y not pressed.");
        }
    }
}
