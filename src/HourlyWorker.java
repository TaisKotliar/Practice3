public class HourlyWorker extends Employee {

    /**
     * Standart work hours in a week
     */
    final int NORMAL_HOURS = 160;
    /**
     * Normal pay for work below 160 hours
     */
    private double payForHours = 100;
    /**
     * Real work hours
     */
    int hoursWork;
    /**
     * Percent for overwork hours
     */
    double percentOver = 1.5;

    public HourlyWorker(String name, String surname, int hoursWork) {
        super.name = name;
        super.surname = surname;
        this.hoursWork = hoursWork;
    }

    public double getPayForHours() {
        return payForHours;
    }

    public void setPayForHours(double payForHours) {
        this.payForHours = payForHours;
    }

    @Override
    public double evaluateSalary() {
        if (hoursWork <= NORMAL_HOURS) {
            salary = payForHours * hoursWork;
        } else {
            salary = (hoursWork - NORMAL_HOURS) * percentOver + NORMAL_HOURS * payForHours;
        }
        return salary;
    }

}

