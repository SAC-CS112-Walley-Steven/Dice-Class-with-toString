import java.util.Scanner;

public class DiceTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		Dice dice = new Dice (0,0,0);

		System.out.println(dice);

		int thrownDice = 0;
		int throwAgain=0;
		int oddDice=0, evenDice=0;
		
		do
		{
			thrownDice++;
			dice.setNumOfThrows(thrownDice);
			
			int diceNum = dice.OneThrow();
			
			System.out.println("\nThrow #"+thrownDice);
			System.out.print("Dice number is "+diceNum);
			
			if (diceNum % 2 == 0)
			{
				System.out.println("\nDice is Even");
				evenDice++;
				dice.setEvenDice(evenDice);
			}
			else
			{
				System.out.println("\nDice is Odd");
				oddDice++;
				dice.setOddDice(oddDice);
			}
			
			System.out.print("\n\nPress 1 to throw again, or 2 to exit: ");
			throwAgain = input.nextInt();
		}
		while (throwAgain ==1);
		
		System.out.println(dice);
	}
}
// Good job...BTW, the evenDice, oddDice belong in the dice itself.
