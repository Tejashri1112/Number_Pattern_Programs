
/* 9 9 9 9 9 9 9 9 9 
 8 8 8 8 8 8 8 8 
  7 7 7 7 7 7 7 
   6 6 6 6 6 6 
    5 5 5 5 5 
     4 4 4 4 
      3 3 3 
       2 2 
        1 */







package Number_Pattern;

public class class1 {
	public static void main(String[] args) 
	{
		int irange=9;
		int jrange=9;
		myCode(irange,jrange);
	}
	//EndOfMainMethod
	public static void myCode(int irange,int jrange)
	{
		//Write code here
		int space=0;
		int end=9;
		int count=9;
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
			count--;
			space++;
		}
	}
}
