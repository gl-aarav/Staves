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
	private String PlayAgain;
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
		Scanner in = new Scanner (System.in);
		System.out.println("\n\n");
		System.out.println("\t\t\tWelcome to Stave.java");		
		do{
			runningscore = 0;
			score = 0;
			do{							
				PlayGame();
				ScoreGame();
				UpdateScore();
				System.out.println("This round earned a score of: " + runningscore);
			  }while (runningscore<5);
			System.out.println("Your total score is " + score + ".");
			do{
				System.out.println("Want to play again?");
				PlayAgain = in.nextLine();
				
				if (PlayAgain.equalsIgnoreCase("yes")){
					
				}	
				else if (PlayAgain.equalsIgnoreCase("no"))
					System.out.println("Thanks for playing!");
				else 
					System.out.println("Please enter in the form or \"yes\" or \"no.\"");
			} while (!PlayAgain.equalsIgnoreCase("yes") && !PlayAgain.equalsIgnoreCase("no"));
		}while (PlayAgain.equalsIgnoreCase("yes"));	
	}	

	public void PlayGame()
	{
		Scanner in = new Scanner (System.in);
		
		Roll roll = new Roll();
		ShowStave stave = new ShowStave();
		
		System.out.print("\nPress return to throw staves.");
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
		score = 0;
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
		
		
	}
	public void UpdateScore()
	{
		runningscore += score;
		
	}		
}

