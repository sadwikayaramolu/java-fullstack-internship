import java.util.*;
class Duplicates
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
      LinkedHashSet<Integer>hs=new LinkedHashSet<>();
      for(int i=0;i<a.length;i++)
      {
          if(!hs.contains(a[i]))
          {
              hs.add(a[i]);
          }
      }
      System.out.println(hs);
    }
}