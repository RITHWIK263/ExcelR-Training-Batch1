public class Employee{
    int id;
    String firstName;
    String lastName;
    String address;

    public Employee(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getfullName(){
        return firstName +' '+ lastName;
    }
    public static void main(String[] args){
        Employee person = new Employee("kyatham","Rithwik");
        System.out.println("FullName:"+person.getfullName());
    }
}