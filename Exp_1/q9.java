package Exp_1;
import java.util.Scanner;

public class q9 {
    public static void main(String[] arg)
    {
        Scanner sc= new Scanner(System.in);

        int base=sc.nextInt();
        int exp= sc.nextInt();
        int result=1;

        for(int i=0; i<=exp; i++)
        {
            result= result*base;
        }
        System.out.println(result);
    }    
}
