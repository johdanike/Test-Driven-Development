import java.util.Scanner;

public class Kata{
	public static void main(String...args){

	Scanner scanner = new Scanner(System.in);
	
			String numbers = "";

			for(int count = 0; count < 10; count++){
				System.out.println("Enter number "+(count+1));
				int number = scanner.nextInt();

				numbers = (numbers + number);
				if(count < 9) numbers+=", ";
			}

			System.out.println(numbers); // "1, 2, 3, 4, 5, 6, 7,..."

			//converting the strings to integer by reading their bytes values
			
			String [] bytes = numbers.split(", ");//["1", "2", "3", "4", "5", "6", "7", "8", "9", "10"]

			int sum = 0;

			for(int counter = 0; counter < bytes.length; counter++){
				String num = bytes[counter];
				int number = Integer.parseInt(num);
				sum+=number;
			}
				System.out.println("Sum of numbers is: "+sum);
	}	
}