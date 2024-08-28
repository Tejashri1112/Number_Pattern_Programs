/*
9
88
777
6666
55555
444444
3333333
22222222
111111111
 */
package Number_Pattern;

public class Number11 {
	public static void main(String[] args) 
	{
		int irange=9;
		
		int end=1;
		int count=9;
		for(int i=1;i<=irange;i++)
		{
			for(int j=1;j<=end;j++)
			{
				System.out.print(count);
			}
			System.out.println();
			end++;
			count--;
		}
	}
}
