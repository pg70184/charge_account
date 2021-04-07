/** Prathamesh Gawade lab 1 chapter 7
4/6/21 */
import javax.swing.JOptionPane;


public class charge_account_validation
{
	public static void main(String [] args)
	{
	String input;			//get users input for this class
	int accountNumber;		//the account number to validate
	
	
	//creates a validator object
	account_numbers val = new account_numbers();
	
	//gets a charge account number
	input = JOptionPane.showInputDialog("Enter your account number: ");
	accountNumber = Integer.parseInt(input);
	
	//determine if the account entered is valid
	if (val.isVaild(accountNumber))
		JOptionPane.showMessageDialog(null, "That's a valid account number");
	else
		JOptionPane.showMessageDialog(null,  "This is INVALID");
	
	
	}
}