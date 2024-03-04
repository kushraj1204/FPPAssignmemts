package Program4;

/**
 * @author kush
 */
public class BasePlusCommissionedEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasePlusCommissionedEmployee(String firstName, String lastName, String socialSecurityNumber,
                                        double grossSales, double commissionRate,double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary=baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    @Override
    protected double getPayment() {
        double commission=super.getPayment();
        return commission+baseSalary;
    }
}
