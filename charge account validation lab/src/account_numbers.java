/** Prathamesh Gawade lab 1 chapter 7
4/6/21 */



public class account_numbers
{
	private int [] valid = {5658845, 4520125, 7895122, 8777541, 8451277,
			1302850, 8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
			1005231, 6545231, 3852085, 7576651, 881200, 4581002};
	
	
	public boolean isVaild(int number)
	{
		boolean found = false;  	//sets false as a default
		int index = 0;				//this is an array index
		
		
		//this will search the array to see if numbers appear
		while (!found && index < valid.length)
		{
			if (valid [index] == number)
				found = true;
			else
				index++;
		}
		
		//returns the output of the search
		return found;

	}
}
