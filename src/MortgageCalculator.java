
public class MortgageCalculator {
	private double principal;
	private double rate;
	private int term;
	
	public MortgageCalculator()
	{
	}
	
	public MortgageCalculator(double principal, double rate, int term) {
		this.principal = principal;
		this.rate = rate;
		this.term = term;
	}

	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	
	public double CalculateAmount(double principal, double rate, int term)
	{
		double payment = (principal * rate) / (1 - Math.pow(1 + rate, -(term*12)));
		return payment;
	}
}
