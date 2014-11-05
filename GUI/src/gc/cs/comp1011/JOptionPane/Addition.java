package gc.cs.comp1011.JOptionPane;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class Addition {

	public static void main(String[] args) {
	
		String numberOne, numberTwo;
		int number1, number2, sumNumbers;
		boolean flagN1 = false, flagN2= false;
		do
		{
					
		try
		{
			numberOne = JOptionPane.showInputDialog("Enter the first integer");
			number1 = Integer.parseInt(numberOne);
			do{
			try
			{
				numberTwo = JOptionPane.showInputDialog("Enter the second integer");
				number2 = Integer.parseInt(numberTwo);
				
				//all the input is valid
				flagN1 = true;
				flagN2 = true;
				sumNumbers = number1 + number2;
				JOptionPane.showMessageDialog(null,
						"The sum of "+number1 +" and "+number2+" is "+ sumNumbers,
						"Sum of Numbers", JOptionPane.PLAIN_MESSAGE);
				
			}
			
			catch(NumberFormatException NTNFE)
			{
				System.out.println(NTNFE.getMessage());
				System.out.println("Please provide an integer for the second number.");
			}
			}
			while(!flagN2);
		}
		catch(HeadlessException HE)
		{
			System.out.println(HE.getMessage());
			System.out.println("Environment does not support a keyboard, display, or mouse");
		}
		catch(NumberFormatException NONFE)
		{
			System.out.println(NONFE.getMessage());
			System.out.println("Please provide an integer for the first number.");
		}
		
		}
		while(!flagN1);
		
	}

}
