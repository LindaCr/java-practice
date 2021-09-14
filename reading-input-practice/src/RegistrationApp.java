import java.util.Scanner;

public class RegistrationApp {

	public static void main(String[] args) {
		System.out.println("Student Registration Form");
		
		Scanner sc= new Scanner(System.in);
		System.out.println();
	
		System.out.print("Enter first name: ");
		String firstName= sc.next();
		System.out.println(firstName);
		
		System.out.println("Enter Last Name: ");
		String lastName= sc.next();
		System.out.println(lastName);
		
		System.out.println("Enter Year of Birth: ");
		int birthYear= sc.nextInt();
		System.out.println(birthYear);
		
		//print the info out together
		System.out.println("Welcome " + firstName+" "+lastName+ "!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: " +firstName+"*"+birthYear);
		
		sc.close();
		System.out.println("Bye");

	}

}
