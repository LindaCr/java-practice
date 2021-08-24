import java.util.ArrayList;
import java.util.List;


public class Bowling {
	
	
	List<Integer> games= new ArrayList<>();

    public int Bowl()
    {
        for (var idx = 1; idx <= 10; idx++)
        {
            System.out.println("Enter score for frame "+idx);
            double score = Math.random();
            games.add((int) score);
        }
        double total = 0;
        for (double score: games)
        {
            total += score;
        }
        return (int) total;
    }

}
