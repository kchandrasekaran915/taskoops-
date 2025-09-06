
class Person {
    private String name;
    private int age;

    // Default constructor: sets default age to 18
    public Person(String name) {
        this.name = name;
        this.age = 18;   // default age
    }

    // Parameterized constructor: initialize with name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Object with default age
        Person p1 = new Person("Arun");
        p1.display();

        // Object with given age
        Person p2 = new Person("Kavya", 25);
        p2.display();
    }
}
