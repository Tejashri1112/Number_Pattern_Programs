/*
1
22
333
4444
55555
666666
7777777
88888888
999999999
 */
package Number_Pattern;

public class Number12 {
	public static void main(String[] args) 
	{	
		int irange=9;
			int end=1;
	int count=1;
	for(int i=1;i<=irange;i++)
	{
		for(int j=1;j<=end;j++)
		{
			System.out.print(count);
		}
		System.out.println();
		end++;
		count++;
	}		
	}
}
