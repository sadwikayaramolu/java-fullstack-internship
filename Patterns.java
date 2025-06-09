import java.util.*;
class Patterns
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter s value");
		int s=sc.nextInt();
		for(int r=1;r<=s;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(" * ");
				
			}
			System.out.println();
			
		}
	}
}