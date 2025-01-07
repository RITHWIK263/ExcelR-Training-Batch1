public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String address;

    public Employee() {
        this.id = 1;
        this.firstName = "Rithwik";
        this.lastName = "Reddy";
        this.address = "Nrl";
    }

    public Employee(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        System.out.println("Employee 1: " );
        System.out.println("ID: " + emp1.id);
        System.out.println("Name: " + emp1.getFullName());
        System.out.println("Address: " + emp1.address);
    }
}