import javax.swing.JOptionPane;
public class NumberOfUpperCase
{
	public static void main(String[] args)
	{
		String input=JOptionPane.showInputDialog("Enter a string");
		int UpperCounter=0;
		for (int i=0;i<=input.length()-1;i++)
		{
			if (Character.isUpperCase(input.charAt(i)))
				UpperCounter++;
		}
		System.out.println("Number of uppercase letters of entered string is: "+UpperCounter);
	}
}