
/*
         1
       12
      123
     1234
    12345
   123456
  1234567
 12345678
123456789
 
 */



package Number_Pattern;

public class Class3 {
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
					System.out.print(cnt);
					cnt++;
				}
			}
			System.out.println();
			space--;
		}
	}
}
