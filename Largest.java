import java.util.*;
class Largest {
    public static int getSecondLargest(int[] arr) {
        HashSet<Integer>s=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!s.contains(arr[i]))
            {
                s.add(arr[i]);
            }
        }
        if(s.size()==1)
        {
            return -1;
        }
        int[] b=new int[s.size()];
        int i=0;
        for(int x:s)
        {
            b[i++]=x;
        }
        Arrays.sort(b);
        return b[b.length-2];
    }  
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
         System.out.print(getSecondLargest(a));
        
    }
}