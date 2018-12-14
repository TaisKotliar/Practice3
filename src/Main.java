import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> myCompany = new ArrayList<>();

        Boss boss = new Boss("Ivan", "Petrov", 7);

        PieceWorker pieceWorker1 = new PieceWorker("Michael1", "Smith1", 5);
        PieceWorker pieceWorker2 = new PieceWorker("Michael2", "Smith2", 10);
        PieceWorker pieceWorker3 = new PieceWorker("Michael3", "Smith3", 20);

        HourlyWorker hourlyWorker1 = new HourlyWorker("Godrik1", "Griffindor1", 200);
        HourlyWorker hourlyWorker2 = new HourlyWorker("Godrik2", "Griffindor2", 160);
        HourlyWorker hourlyWorker3 = new HourlyWorker("Godrik3", "Griffindor3", 100);

        CommissionWorker commissionWorker1 = new CommissionWorker("Merlin1", "Kramli1", 20000);
        CommissionWorker commissionWorker2 = new CommissionWorker("Merlin2", "Kramli2", 20500);
        CommissionWorker commissionWorker3 = new CommissionWorker("Merlin3", "Kramli3", 30000);

        hourlyWorker1.setPayForHours(50);

        myCompany.add(boss);
        myCompany.add(pieceWorker1);
        myCompany.add(pieceWorker2);
        myCompany.add(pieceWorker3);
        myCompany.add(hourlyWorker1);
        myCompany.add(hourlyWorker2);
        myCompany.add(hourlyWorker3);
        myCompany.add(commissionWorker1);
        myCompany.add(commissionWorker2);
        myCompany.add(commissionWorker3);


        double summary = 0;
        for (Employee currentEmployee : myCompany) {
            System.out.println(currentEmployee.getClass().toString() + "\n");
            currentEmployee.evaluateSalary();
            currentEmployee.displayInfo();
            summary += currentEmployee.salary;
        }
        System.out.println("Summary Salary: " + summary);
    }
}
