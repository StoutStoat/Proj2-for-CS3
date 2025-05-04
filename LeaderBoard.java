import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * This class handles the scores.
 * You get 1 point for every win.
 */
public class LeaderBoard {
    static List<Integer> board = new ArrayList<>();

    public LeaderBoard()
    {   
    }
    /**
     * @return Whatever winstreak you got.
     * @param Whatever winstreak you got.
     */
    public static void addScore(String input)
    {    
        try (FileWriter write = new FileWriter("saves/Saves.txt", true); PrintWriter out = new PrintWriter(write);)
        {
            out.println(input);
            write.close();
        } catch (IOException e)
        {
            System.out.println("Failed.");
            e.printStackTrace();
        }
    }
    /**
     * Returns the highest recorded score.
     * @return Self explanatory. Reads the file and returns whatever the highest number is in there.
     */
    public static int returnBoard()
    {
        Scanner num = null;
        int highest = Integer.MIN_VALUE;
        try
        {
            num = new Scanner(new File("saves/Saves.txt"));
            do
            {
                board.add(Integer.valueOf(num.nextLine()));
            } while(num.hasNextLine() == true);
            for (int i = 0; i < board.size(); i++)
            {
                if (highest < (board.get(i)))
                {
                    highest = board.get(i);
                }
            }
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return highest;
    }
}
