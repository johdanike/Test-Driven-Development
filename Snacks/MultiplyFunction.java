public class MultiplyFunction{

	public int computeMultiply(int number1, int number2 ){
		int total = 0;
		for(int counter = 1; counter <= number1; counter++){
			if (number2 < 0) number2 = number2 - (number2) - (number2);
			total += number2 ;
		}
		
			return total;
	}
}
