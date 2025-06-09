import java.util.Scanner;

class ParameterArea
 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value: ");
        int a = sc.nextInt();

        System.out.println("Enter b value: ");
        int b = sc.nextInt();

	System.out.println("Enter c value: ");
        int c = sc.nextInt();

      	int t=a+b+c;

      System.out.print("area is:"+t);
    }
}