import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyTest{

	@Test
	public void testMultiplyWithoutTimes(){
		
		//given
			MultiplyFunction calculator = new MultiplyFunction();
		//when
			int number1 = 5;
			int number2 = 4;
			int result = calculator.computeMultiply(number1, number2 );
		//assert
			assertEquals(20, result);	


	}


}


