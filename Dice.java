public class Dice {
	
	private static int numOfThrows;
	private static int oddDice;
	private static int evenDice;
	
	public Dice (int numOfThrows, int oddDice, int evenDice)
	{
		this.numOfThrows = numOfThrows;
		this.oddDice = oddDice;
		this.evenDice = evenDice;
	}
	
	public void setNumOfThrows (int numOfThrows)
	{
		this.numOfThrows = numOfThrows;
	}
	public int getNumOfThrows()
	{
		return numOfThrows;
	}
	
	public static int OneThrow()
	{
		numOfThrows++;

		int randNum = 1+(int)(Math.random()*6);
		{
		if(randNum %2==0)
			evenDice++;
		else
			oddDice++;
		}	
		return randNum;
	}

	public static int Throw(int dices, int bounces)
	{
		int randNum = (dices*(1+(int)(Math.random()*6)))+bounces;
		return randNum;
	}
	
	public String toString()
	{
		return String.format("\n-Dice Attributes-\nNum of times thrown: %d\nNum of Odd Dice: %d\nNum of Even Dice: %d",
				numOfThrows, oddDice, evenDice);
	}
}