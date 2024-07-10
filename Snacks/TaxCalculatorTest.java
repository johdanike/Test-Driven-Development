import  org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaxCalculatorTest{
	
	@Test
	public void testCalculatorTax(){
		//given
		TaxCalculator taxCalculator = new TaxCalculator();
		//when
		double tax = taxCalculator.calculate(30_000);
		//assert
		System.out.println(tax);
		assertEquals(4500.00, tax);
		


	}

	@Test
	public void testCalculateTaxForInvalidAmountFails(){
		//given
		TaxCalculator taxCalculator = new TaxCalculator();
		//when
		//assert
		assertThrows(RuntimeException.class, ()->taxCalculator.calculate(-30_000));
; 
	}
	
}