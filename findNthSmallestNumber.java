import javax.swing.JOptionPane;
public class findNthSmallestNumber
{
	public static void main(String[] args)
	{
		int numbers[] = new int[15];
		for(int i=0;i<numbers.length;i++)
		{
			numbers[i]=(int)((100*Math.random())+1);
		}
		String input=JOptionPane.showInputDialog("Enter an integer between 1 and 15");
		int n=Integer.parseInt(input);
		String thpart;
		if(n==1)
			thpart="st";
		else if(n==2)
			thpart="nd";
		else
			thpart="th";
		System.out.println(findNthSmallestNumber(n,numbers)+". ("+n+thpart+" smallest element).");
	}
	public static int findNthSmallestNumber(int n, int[ ] numbers)
	{
		for(int a=0;a<numbers.length;a++)
		{
			for(int b=1;b<numbers.length;b++)
			{
				if (numbers[b-1]>numbers[b])
				{
				int temp=numbers[b];
				numbers[b]=numbers[b-1];
				numbers[b-1]=temp;
				}
			}
		}
		return numbers[n-1];
	}
}