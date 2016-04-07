import java.text.NumberFormat;

public class MortgageFormat {
	
	public MortgageFormat() {
	}

	public String FormatTheAmount(double amount)
	{
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		return(formatter.format(amount));
	}
}
