public class Employee {
	
	private int employeeId;
	private String firstname;
	
	public Employee(){
		this.employeeId = 1;
		this.firstname = "Juan";
	}
	
	public void setEmployeeId(int employeeId){
		this.employeeId = employeeId;
	}
	
	public int getEmployeeId(){
		return employeeId;
	}
	
	public void setFirstName(String firstname) {
		this.firstName = firstName;
	}
	
	public String getFirstName(){
		return firstName;
	}
}