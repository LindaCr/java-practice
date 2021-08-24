
public class ModulusPracticeApp {

	public static void main(String[] args) {
		System.out.println("Hola!");
		System.out.println();
		
        System.out.println("FizzBuzz");

        
        for (var idx=1; idx<=30; idx++)
        {
            if (idx % 3 == 0 && idx % 5== 0)
            {
                System.out.println("FIZZBUZZ");
                continue;
            }
             if (idx%3==0) {
                System.out.println("FIZZ");
                continue;
            }
             if (idx%5==0)
            {
                System.out.println("BUZZ");
                continue;
            }
            else
            {
                System.out.println(idx);
            }
        }
		
		System.out.println("Peace");

	}

}
