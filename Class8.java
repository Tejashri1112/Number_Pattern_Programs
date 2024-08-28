/*
5
54
543
5432
54321
 */
package Number_Pattern;

public class Class8 {
	public static void main(String[] args) 
	{
		int irange=5;
		int count=5;
		int end=1;
		for(int i=1;i<=irange;i++)
		{
			int cnt=count;
			for(int j=1;j<=end;j++)
			{
				System.out.print(cnt);
				cnt--;
			}
			System.out.println();
			end++;
		}
	}
}
