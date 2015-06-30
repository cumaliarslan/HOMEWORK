import javax.swing.JOptionPane;
public class AnagramTest
{
	public static void main(String[] args)
	{
		String s1 = JOptionPane.showInputDialog("Enter 1st string");
		String s2 = JOptionPane.showInputDialog("Enter 2nd string");
		String result;
		if(Anagram.isAnagram(s1.toLowerCase(),s2.toLowerCase()))
			result="anagrams.";
		else
			result="not anagrams.";
		System.out.println("Entered strings are "+result);

	}
}