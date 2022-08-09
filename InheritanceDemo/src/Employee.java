

public class Employee {

	private String empId;
	private String firstName;
	private String lastName;
	private String location;
	private float salary;
	
	public Employee(String empId, String firstName, String lastName, String location, float salary) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.location = location;
		this.salary = salary;
	}
	
	

public Employee(String empId, String firstName, String lastName) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
	}


/*	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Hello from Emp");
	}
*/

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", location="
				+ location + ", salary=" + salary + "]";
	}



	public float calculateSalary() {
		//System.out.println("Hello from Employee");
		return salary;
	}
	
	
	
	
}

