package Exp_1;
import java.util.Scanner;

public class q5 {
    public static void main(String[] arg)
    {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b =sc.nextInt();
        int rem;

        while(b!=0)
        {
            rem = a%b;
            a=b;
            b=rem;
        }
        System.out.print(a);
    }    
}
