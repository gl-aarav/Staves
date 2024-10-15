/*
 * Aarav Goyal
 * Stave.java
 * 10/11/2024 
 */

import java.util.Scanner;
public class Stave
{
	private int roll1;
	private int roll2;
	private int roll3;
	private int roll4;
	private int score;
	private int runningscore;
	public Stave(){
		roll1 = 0;
		roll2 = 0;
		roll3 = 0;
		roll4 = 0;
		score = 0;
		runningscore = 0;
	}

	public static void main (String[] args)
	{
		Stave stave = new Stave();
		stave.RunGame();
	}
	
	public void RunGame()
	{
		System.out.println("\n\n");
		System.out.println("\t\t\tWelcome to Stave.java");		

		for (int i = 0; i < 3; i++)	
		{							
			PlayGame();
			ScoreGame();
			UpdateScore();
		}
		System.out.println("Your final score is " + score + ".\n\n\n");
	}

	public void PlayGame()
	{
		Scanner in = new Scanner (System.in);
		
		Roll roll = new Roll();
		ShowStave stave = new ShowStave();
		
		System.out.print("Press return to throw chips.");
		String typed = in.nextLine();  
		
		roll1 =	roll.RollStave();
		stave.DisplayStave(roll1);
		
		roll2 =	roll.RollStave();
		stave.DisplayStave(roll2);
		
		roll3 =	roll.RollStave();
		stave.DisplayStave(roll3);
		
		roll4 =	roll.RollStave();
		stave.DisplayStave(roll4);
		
		
	}	
	public void ScoreGame()
	{
		String rolls = new String("");
		rolls = "" + (char)roll1 + (char)roll2 + (char)roll3 + (char)roll4;

		int	count = 0;

		for	(int index = 0; index<4; index ++)
		{
			if (rolls.charAt(index) == '$')
				count ++;
		}

		if (count == 4 || count == 0)
			score += 2;
		else if (count == 2)
			score ++;
		
		System.out.println("Current score: " + score);
	}
	public void UpdateScore()
	{
		runningscore += score;
	}		
}
