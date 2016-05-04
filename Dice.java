
public class Dice {
	
	private int numOfThrows;
	private int oddDice;
	private int evenDice;
	
	public Dice (int numOfThrows, int oddDice, int evenDice)
	{
		this.numOfThrows = numOfThrows;
		this.oddDice = oddDice;
		this.evenDice = evenDice;
	}
	
	public void setNumOfThrows (int numOfThrows)
	{
		this.numOfThrows = numOfThrows + 1;
	}
	
	public void setOddDice (int oddDice)
	{
		this.oddDice = oddDice;
	}
	
	public void setEvenDice (int evenDice)
	{
		this.evenDice = evenDice;
	}
	
	public static int OneThrow()
	{
		int randNum = 1+(int)(Math.random()*6);
		return randNum;
	}

	public static int Throw(int dices, int bounces)
	{
		int randNum = (dices*(1+(int)(Math.random()*6)))+bounces;
		return randNum;
	}
	
	public String toString()
	{
		return String.format("\nNo of times thrown: %d\nNum of Odd Dice: %d\nNum of Even Dice: %d", (numOfThrows-1), oddDice, evenDice);
	}
}
