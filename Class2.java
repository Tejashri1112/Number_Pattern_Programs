/*       
9
98
987
9876
98765
987654
9876543
98765432
987654321   */





package Number_Pattern;

public class Class2 {
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
		int end=1;
		int count=9;
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
