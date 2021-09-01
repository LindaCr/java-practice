import java.util.Scanner;

public class DiceRollApp {

	public static void main(String[] args) {
		System.out.println("Hola!");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Roll the dice? y/n");
		String roll=sc.next();
		
		int die1=1;
		int die2=1;
		String choice="y";
		while (choice.equalsIgnoreCase("y")) {
			
			
			die1= (int) (Math.random()*6)+1;
			die2= (int) (Math.random()*6)+1;
			int total= die1+die2;

			
			System.out.println("Die 1: "+die1);
			System.out.println("Die 2: "+die2);
			System.out.println("Total: "+total);
			
			if (die1==1 && die2==1) {
				total=2;
				System.out.println("Snake Eyes!");
			}
			if (die1==6 && die2==6) {
				total=12;
				System.out.println("Boxcars!");
			}
			
			
			
			System.out.println("Roll Again? y/n");
			choice=sc.next();
		}
		
		
		
		sc.close();
		System.out.println("Peace");

	}

}
