public class HourlyWorker extends Employee {

    /**
     * Standart work hours in a week
     */
    final int NORMALHOURS = 160;
    /**
     * Normal pay for work below 160 hours
     */
    double payForHours = 100;
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

    @Override
    public double evaluateSalary() {
        if (hoursWork <= NORMALHOURS) {
            salary = payForHours * hoursWork;
        } else {
            salary = (hoursWork - NORMALHOURS) * percentOver + NORMALHOURS * payForHours;
        }
        return salary;
    }

}

