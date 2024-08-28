/*
        1 
       1 2 
      1 2 3 
     1 2 3 4 
    1 2 3 4 5 
   1 2 3 4 5 6 
  1 2 3 4 5 6 7 
 1 2 3 4 5 6 7 8 
1 2 3 4 5 6 7 8 9 
 */
package Number_Pattern;

public class Class9 {
	public static void main(String[] args) 
	{
		int irange=9;
		int end=9;
		int space=8;
		int count=1;
		for(int i=1;i<=irange;i++)
		{
			int cnt=count;
			for(int j=1;j<=end;j++)
			{
				if(j<=space)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(cnt+" ");
					cnt++;
				}
			}
			System.out.println();
			space--;
		}
	}
}
