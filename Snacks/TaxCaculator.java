
public class TaxCalculator{
	public double calculate(double income){
		String tax = "";
		if(income <= 30_000){
			tax = String.format("%.2f",(15/100.0) * income);
		}
		return Double.parseDouble(tax);
	}
}
