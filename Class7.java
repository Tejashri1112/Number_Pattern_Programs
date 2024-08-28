/*
1
12
123
1234
12345

 */
package Number_Pattern;

public class Class7 {
	public static void main(String[] args) 
	{
		int irange=5;
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
			end++;
		}
	}
}
