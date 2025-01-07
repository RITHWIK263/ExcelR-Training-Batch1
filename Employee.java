public class Employee {
    public static void main(String[] args) {
	 int id;
	 String firstName;
	 String lastName;
	 String address;
	
	public Employee(int id, String firstName, String lastName, String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	public String getFullName(){
		return firstName+" "+lastName;
	}
	
	public void sendMessage(){
		System.out.println("Salary added successfully...");
	}	
}

