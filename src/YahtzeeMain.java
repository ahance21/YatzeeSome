import java.util.Random;
import java.util.Scanner;

public class YahtzeeMain
{
public static void main(String[] args)
{
Random rand = new Random();
Scanner scan = new Scanner(System.in);
int a = rand.nextInt(6) + 1;
Yahtzee yahtzee = new Yahtzee();
yahtzee.rollAllDice();
System.out.println(yahtzee.showDice());
System.out.println("Get value of die number 3 is " + yahtzee.getADie(a));
yahtzee.rollADice(3);
System.out.println(yahtzee.showDice());
System.out.println("After re-roll the die number 3: " + yahtzee.getADie(a));
}
}
