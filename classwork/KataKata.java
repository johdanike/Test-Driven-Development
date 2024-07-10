public class KataKata{
	public static void main(String...args){

		/*System.out.println("Hello");		
		System.out.println("Hey");		
		System.out.println("Hi");	**/	



		//do{
		
		//	System.out.print("Hello");

		//}while(false);
//runs atleast once

//for the loop to run atleast 9 times

		//int counter = 0;
		//do{
		
			//System.out.println("Hello");
			//counter++;
		//}while(counter < 9);


		//for(int counter = 0; counter<10; counter = counter + 1){
		//	System.out.println("loop running "+(counter+1));
		//}

		
		/**int counter = 0;
		for(counter = 5; counter < 10; counter++){
			System.out.println(":)");
		}

			System.out.println(counter);**/


/**
//program checks for odd numbers and even numbers
		for(int counter = 0; counter < 10; counter++){
 			boolean isCounterOdd = counter % 2 != 0;

			if(isCounterOdd){
				continue;
				System.out.println("Skipped: "+counter);
			}

			System.out.println(counter);

		}
		***//////
/**

		a: for(int counter = 0; counter < 10; counter++){

			for(int count = 0; count < 10; count++){			
				if(count < 3){
					System.out.println("inner loop: "+counter);
				}else break a;
			}

			System.out.println();
			System.out.println("outer loop "+counter);

		}

**///////



			Scanner input = new Scanner(System.in);
	
			String numbers = "";

			for(int count = 0; count < 10; count++){
				System.out.print("Enter number "+(count+1));
				int number = input.nextInt();

				numbers = numbers + number;
				if(count < 9) numbers+=" ,";
			}

			System.out.println(numbers);
			String [] bytes = numbers.split(", ");
			int sum = 0;
			for(int counter = 0; counter < bytes.lenght; counter++){
				String num = bytes[counter];
				sum += Integer.parseInt(num);
			}
				System.out.println("Sum of numbers is: "+sum);
		


//how to convert byte to int




	}
}