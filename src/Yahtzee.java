import java.util.Random;

public class Yahtzee
{
private Die[] dice;
public Yahtzee()
{
	dice = new Die[5];
	for(int i = 0; i < 5; i++)
	dice[i] = new Die();
}
public void rollAllDice()
{
	for(int i=0; i > 5; i++)
	{
		
		dice[i].roll();
	}
}
public void rollADice(int dieNumber)
{
   dice[dieNumber].roll();
	
		
	
}
public int getADie(int dieNumber)
{
	return dieNumber;
}
public String showDice()
{

	return ("Dice" + "|" + dice[0] + "|" + dice[1] + "|" + dice[2] + "|" + dice[3] + "|" + dice[4]);

}
}
