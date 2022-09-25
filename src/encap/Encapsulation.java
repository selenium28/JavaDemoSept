package encap;

public class Encapsulation {
	
	// Hiding the actual implemention outside the class
	private int empid;
	private String name;
	private double salary;

	// public getter and setter methods
	public int getEmpid() {
		return empid;
	}
	
	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setEmpid(51122);
		obj.setName("Dev");
		obj.setSalary(50000);
		
		System.out.println("Empid: "+obj.getEmpid());
		System.out.println("Name: "+obj.getName());
		System.out.println("Salary: "+obj.getSalary());
		
	}

}
