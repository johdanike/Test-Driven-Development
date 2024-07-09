import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GasMileageCalculatorTest{

	@Test
	public void testCanCalculateMilesPerGallon(){
		
		//given
			GasMileageCalculatorFunction calculator = new GasMileageCalculatorFunction();
		//when
			double numberOfMilesDriven = 30.00;
			double numberOfGallonsUsed = 20.00;
			double milesPerGallon = calculator.computeMilesPerGallon(numberOfMilesDriven, numberOfGallonsUsed );
		//assert
			assertEquals(1.5, milesPerGallon);	


	}
	

}