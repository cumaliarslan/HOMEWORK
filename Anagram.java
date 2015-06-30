public class Anagram
{
	public static boolean isAnagram(String s1, String s2)
	{
		int counts1[] = countLetters(s1);
		int counts2[] = countLetters(s2);
		for (int i=0;i<=counts1.length-1;i++)
		{
			if (counts1[i]!=counts2[i])
				return false;
		}
		return true;

	}
	public static int[] countLetters(String s)
	{
    int[] counts = new int[255];
    for (int i = 0; i < s.length(); i++)
    {
    if (Character.isLetter(s.charAt(i)))
    	{
      		counts[s.charAt(i)]++;
    	}
    }
    return counts;
	}
}