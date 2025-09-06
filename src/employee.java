
class Employee extends Person {
    private int employeeId;
    private double salary;

    // Constructor using super to call Person's constructor
    public Employee(String name, int age, int employeeId, double salary) {
        super(name, age);  // calls Person(String name, int age)
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Method to display Employee details
    @Override
    public void display() {
        super.display(); // call Person's display()
        System.out.println("Employee ID: " + employeeId + ", Salary: " + salary);
    }


    // Main method to test
    public static void main(String[] args) {
        Employee emp1 = new Employee("Arjun", 30, 101, 55000);
        emp1.display();

        Employee emp2 = new Employee("Kavya", 25, 102, 65000);
        emp2.display();
    }



}


