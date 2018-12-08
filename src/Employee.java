public abstract class Employee {
    String name;
    String surname;
    double salary;

    public abstract double evaluateSalary();

    public void displayInfo() {
        getClass().toString();
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Salary: " + salary);
    }
}
