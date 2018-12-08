public class PieceWorker extends Employee {

    /**
     * Number of items
     */
    int items;
    /**
     * Pay for one item
     */
    double payForItems = 400;

    public PieceWorker(String name, String surname, int items) {
        super.name = name;
        super.surname = surname;
        this.items = items;
    }

    @Override
    public double evaluateSalary() {
        salary = items * payForItems;
        return salary;
    }

}
