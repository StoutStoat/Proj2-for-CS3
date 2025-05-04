import java.io.File;
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
    static String board = "";

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
     * 
     * @return Self explanatory. Reads the file and returns whatever string is in there.
     */
    public static String returnBoard()
    {
        Scanner num = null;
        try
        {
            num = new Scanner(new File("saves/Saves.txt"));
           do{
                    board += num.nextLine() + ", ";
            } while(num.nextLine() != null);
            board = board.substring(0, board.length() -1);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        
        return board;
    }
}
