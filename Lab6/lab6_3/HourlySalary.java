package lab6_3;

public class HourlySalary extends Employee{
	private double money;
	private double times;
	
	public HourlySalary(String first,String last,String ssn, double money,double times) {
		super(first, last, ssn);
		this.setTimes(times);
		this.setMoney(money);
	}
	
	public String toString() {
		return String.format("HourlySalary Employee : %s\nhourly pay: $%.2f  ; hours worked : %.2f", super.toString(), getMoney(), getTimes());
	}

	public double earnings() {

		return times*money; 
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public double getTimes() {
		return times;
	}

	public void setTimes(double times) {
		this.times = times;
	}

}