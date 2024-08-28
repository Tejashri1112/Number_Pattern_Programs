/*
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 
 */



package Number_Pattern;

public class Class6 {
	public static void main(String[] args) 
	{
		int irange=5;
		int jrange=5;
		myCode(irange,jrange);
	}
	//EndOfMainMethod
	public static void myCode(int irange,int jrange)
	{
		//Write code here
		int end=5;
		int count=1;
		int space=4;
		for(int i=1;i<=irange;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(j<=space)
				System.out.print(" ");
				else
				System.out.print(count+" ");
			}
			System.out.println();
			count++;
			space--;
		}
	}
}
