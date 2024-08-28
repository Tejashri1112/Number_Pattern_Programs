/*
1
12
123
1234
12345
1234
123
12
1

 */
package Number_Pattern;

public class Number10 {
	public static void main(String[] args) 
	{
		int irange=9;
		int end=1;
		int count=1;
		for(int i=1;i<=irange;i++)
		{
			int cnt=count;
			for(int j=1;j<=end;j++)
			{
				System.out.print(cnt);
				cnt++;
			}
			System.out.println();
			if(i<5)
			end++;
			else
			end--;
		}
	}
}
