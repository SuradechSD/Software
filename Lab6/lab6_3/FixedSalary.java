package lab6_3;

public class FixedSalary extends Employee {
	
	private double salary ;
	public FixedSalary(String first,String last,String ssn, double salary ) {
		super(first, last, ssn);
		setSalary(salary);
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double earnings() {
		return getSalary();
	}
	public String toString() {
		return String.format("Fixed salary exployee: %s\nmonthly salary: $%.2f", super.toString(), getSalary());
	}
}