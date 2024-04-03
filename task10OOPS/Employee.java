package task10OOPS;
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    // Setter method
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Calculate annual salary
    public int getAnnualSalary() {
        return salary * 12;
    }

    // Method to raise salary by a percentage
    public int raiseSalary(int percent) {
        double increaseFactor = (100 + percent) / 100.0;
        salary = (int) (salary * increaseFactor);
        return salary;
    }

    // toString method to represent Employee object as a String
    @Override
    public String toString() {
        return "Employee[id=" + id + ", name " + getName() + ", salary=" + salary + "]";
    }

    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee(1, "Umamakeswari", "Murugesan", 50000);

        // Print employee details
        System.out.println(emp);

        // Raise salary by 10%
        emp.raiseSalary(10);

        // Print updated salary
        System.out.println("Updated salary: " + emp.getSalary());
    }
}