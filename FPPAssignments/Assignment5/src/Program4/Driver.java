package Program4;

/**
 * @author kush
 */
public class Driver {
    public static void main(String[] args) {
        Employee[] employees={
                new HourlyEmployee("Harry","Styles","8923456789",10,25),
                new CommissionEmployee("Johan","Roberts","7761254245",100,5),
                new BasePlusCommissionedEmployee("Kevin","Owens","1897655266",10,25,2500),
                new SalariedEmployee("Vince","McMahon","5427300487",1000),
                new HourlyEmployee("Tom","Felton","9846648940",12,40),
        };
        double totalSalaries=0;
        for (Employee e:employees){
            totalSalaries=totalSalaries+e.getPayment();
        }
        System.out.println("The total salary is: "+totalSalaries);
    }
}
