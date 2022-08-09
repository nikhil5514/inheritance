
public class Main {

	public static void printDetails(Employee e) {
		//should be applicable to only emp and its hierarchy
		System.out.println(e);
		//System.out.println(e.getClass());
		//System.out.println(e instanceof Employee);
	}
	
	public static void main(String[] args) {
		
		//Object manager = new Manager("nn001", "nikhil", "naik", null, 0);
		//Reference is of object type, so we can access only Object fileds
		
		//manager.
		
		//Employee manager1 = new Manager("nn001", "nikhil", "naik", null, 0);
		//manager1.setProjectAllowance(200.0f);
		//manager1.
		
		//We can access object, employee and manager
		//object and manager of type Manager
		Manager manager2 = new Manager("nn001", "nikhil", "naik", null, 0);
		float result = manager2.calculateSalary();
		//System.out.println(result);
		
		//cannot convert from Employee to Manager
		//Manager m = new Employee("nn001", "nikhil", "naik", null, 0);
		
		
		//casting 
		Employee manager = new Manager("nn001", "nikhil", "naik", null, 0);
		Manager mgr2 = (Manager)manager;
		Employee e2 = manager;
		
		Object obj = manager;
		
		//Type and casting type must be same
		//Manager m3 = (Employee)obj;
		
		Main.printDetails(new Manager("nn001", "nikhil", "naik", null, 0));
		//Employee e = new Manager();

	}

}
