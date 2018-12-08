import java.util.Calendar;

public class Boss extends Employee {

    /**
     * Fixed pay for one week
     */
    double salaryWeek = 10000;
    /**
     * Real work day
     */
    int dayPay;

    public Boss(String name, String surname, int dayPay) {
        super.name = name;
        super.surname = surname;
        this.dayPay = dayPay;
    }

    @Override
    public double evaluateSalary() {

        double salaryDay = salaryWeek / Calendar.DAY_OF_WEEK;
        salary = dayPay * salaryDay;
        return salary;
    }

}