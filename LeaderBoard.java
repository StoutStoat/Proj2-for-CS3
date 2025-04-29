import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class LeaderBoard {
	static String board = "";

	public LeaderBoard()
	{
		
	}
	
	/**
	 * @return Whatever winstreak you got.
	 * @param Whatever winstreak you got
	 */
	public static void addScore(String input)
	{
		try
		{
			
			FileWriter write = new FileWriter("saves/Saves.txt");
			write.write(input + "\n");
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
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		board += num.nextLine();
		return board;
	}
	
}
