import java.util.Scanner;

public class ForLoopPractice {

	//arrow challenge
	public static void main(String[] args) {
		System.out.println("Hola");
		System.out.println();
		Scanner sc= new Scanner(System.in);
		
		String choice="y";
		while (choice.equalsIgnoreCase("y")) {
			
			System.out.println("Enter a number 1-10");
			int n=sc.nextInt();
			
			printArrow(n);
			
			System.out.println("Continue? y/n"); 
			choice=sc.next();
		}
		
		sc.close();
		System.out.println("Peace");

	}

	static void printArrow(int n)
	{

	    for (int i = 1; i < n; i++) {

	        for (int j = 0; j < i; j++) {
	            System.out.print(" ");
	        }

	        for (int k = 0; k < i; k++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }

	    for (int i = 0; i < n; i++) {

	        for (int j = 0; j < n - i; j++) {
	            System.out.print(" ");
	        }

	        for (int k = 0; k < n - i; k++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
}
