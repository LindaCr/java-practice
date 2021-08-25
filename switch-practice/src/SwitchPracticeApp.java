import java.util.Scanner;

public class SwitchPracticeApp {

	public static void main(String[] args) {
		System.out.println("Hola!");
		System.out.println();
		Scanner sc= new Scanner(System.in);
		
		String choice="y";
		while(choice.equalsIgnoreCase("y")) {
			displayMenu();
			System.out.println("Command: ");
			String command=sc.next();
			switch (command) {
			case "cat":
				System.out.println("The cat says ");
				System.out.println("================");
				System.out.println("Meow");
				break;
			case "dog":
				System.out.println("The dog says ");
				System.out.println("================");
				System.out.println("Woof Woof");
				break;
			case "cow":
				System.out.println("The cow says ");
				System.out.println("================");
				System.out.println("Mooooooo");
				break;
			case "pig":
				System.out.println("The pig says ");
				System.out.println("================");
				System.out.println("Oink Oink");
				break;
			case "exit":
				//leave program
				break;
			default:
				System.out.println("Invalid Command. Try Again");
				break;
			}
			
			System.out.println("Continue? y/n");
			choice=sc.next();
		}
			System.out.println();
			
		sc.close();	
		System.out.println("Peace");
	}

	private static void displayMenu() {
		System.out.println("Command Menu: ");
		System.out.println("======================");
		System.out.println("cat");
		System.out.println("dog");
		System.out.println("cow");
		System.out.println("pig");
		System.out.println("exit- exit program");
		System.out.println();
	}
}
