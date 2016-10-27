import java.util.Scanner;

public class Lab3 {
	public static void main(String[] args) {
		//Prompt user for integer
		Scanner scan = new Scanner(System.in);
		
		String choice = "y";
		int num = 0;
				
		System.out.println("Enter program to learn to calculate square and cube");
		
		while(choice.equalsIgnoreCase("y")){
			
		System.out.println("Enter and integer: ");
		 num = scan.nextInt();
		 System.out.println("You entered a negative number");
			
		System.out.println("Number"+"\t\tsquare" + "\t\tcube");
		System.out.println("======"+"\t\t======"+"\t\t=====" );
			
		
		for(int i = 1; i < num + 1; i++) {
			int square = i * i;
			int cube = square * i;
			System.out.println(i + "\t\t" + square + "\t\t" + cube );
		
		}
		System.out.println("Do you want to continue? y/n");
		choice = scan.next();
		if(!choice.equalsIgnoreCase("y")){
			System.out.println("Bye");

		}
		}
	 
		
		
		scan.close();
		
		
	}
}
