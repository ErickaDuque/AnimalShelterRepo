public class Employee {
	
	private int employeeId;
	private String name;
	
	public Employee(){
		this.employeeId = 1;
		this.name = "Juan";
	}
	
	public void setEmployeeId(int employeeId){
		this.employeeId = employeeId;
	}
	
	public int getEmployeeId(){
		return employeeId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}