public class Employee {
	
	private int id;
	private String firstname;
	
	public Employee(){
		this.id = 1;
		this.firstname = "Juan";
	}
	
	public void setId(int employeeId){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	public void setFirstName(String firstname) {
		this.firstName = firstName;
	}
	
	public String getFirstName(){
		return firstName;
	}
}
