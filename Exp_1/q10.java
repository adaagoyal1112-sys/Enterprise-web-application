package Exp_1;
import java.util.Scanner;

public class q10 {
    public static void main(String[] arg)
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int org=n;
        int rev=0;
        while(n!=0)
        {
            int dig=n%10;
            rev=rev*10+dig;
            n=n/10;
        }
        if(org==rev)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }    
}
