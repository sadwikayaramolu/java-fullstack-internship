import java.util.*;
import java.util.Arrays;

class Matrix2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("enter size");
		int s=sc.nextInt();
		int a[]=new int[s];
		System.out.println("enter values");
		for(int i=0;i<s;i++)
		{
			{
		
				a[i]=sc.nextInt();
			}
		}
		int c=0;
		int j;
		for(int i=0;i<s;i++)
		{
			if(a[i]==1)
			{
				i++;
				j=i;
				if(j<s)
				{
					if(a[j]==0)
					{
						c++;
					
					}
					j++;
				}
			}
				
		}
		System.out.println(c);
		
	}
}