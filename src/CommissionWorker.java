public class CommissionWorker extends Employee {

    /**
     * Basic salary for month
     */
    public double salaryMonth = 5000;
    /**
     * Summary value of sale in dollars
     */
    double saleValue;
    /**
     * Comision percent
     */
    double salePercent = 0.05;

    public CommissionWorker(String name, String surname, double saleValue) {
        super.name = name;
        super.surname = surname;
        this.saleValue = saleValue;
    }

    @Override
    public double evaluateSalary() {
        salary = salaryMonth + saleValue * salePercent;
        return salary;
    }

}
