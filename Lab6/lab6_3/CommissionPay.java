package lab6_3;

public class CommissionPay extends Employee{
    private double sale;
    private double rate;
	public CommissionPay(String first,String last,String ssn, double sale, double rate) {
		super(first, last, ssn);
		this.sale = sale;
		this.rate = rate;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getSale() {
		return sale;
	}
	public void setSale(double sale) {
		this.sale = sale;
	}
	public String toString() {
		return String.format("Commission Employee : %s\ngross sales : $%.2f ; commission rate : %.2f", super.toString(), getSale(), getRate());
	}
	public double earnings() {

		return sale*rate ; 
	}

}
