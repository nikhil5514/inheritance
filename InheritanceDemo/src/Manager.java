
public class Manager extends Employee {

	private float projectAllowance;
	private String projectName;
	
	public Manager(String empId, String firstName, String lastName, String location, float salary, String projectName, float projectAllowance) {
		super(empId, firstName, lastName, location, salary);
		this.projectName = projectName;
		this.projectAllowance = projectAllowance;
		
		// TODO Auto-generated constructor stub
	}

	public Manager(String empId, String firstName, String lastName, String projectName, float projectAllowance) {
		super(empId, firstName, lastName);
		this.projectName = projectName;
		this.projectAllowance = projectAllowance;
		// TODO Auto-generated constructor stub
	}
	
	
	
	public float getProjectAllowance() {
		return projectAllowance;
	}

	public void setProjectAllowance(float projectAllowance) {
		this.projectAllowance = projectAllowance;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public float calculateSalary() {
		// TODO Auto-generated method stub
		//System.out.println("Hello from Manager");
		return super.calculateSalary() + projectAllowance;
	}
	
	
	
	
	
	
}
