package Exp_1;
import java.util.Scanner;

public class q4 {
    public static void main(String[] arg)
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int a=0;
        int b=1;
        int c;
        for(int i=1; i<=n;i++)
        {
            System.out.print(a + " ");
            c=a+b;
            a=b;
            b=c;
        }
    }    
}
