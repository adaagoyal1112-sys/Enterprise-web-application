package Exp_1;
import java.util.Scanner;

public class q6 {
    public static void main(String[] arg)
    {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        int lcm= Math.max(a,b);

        while(lcm % a!=0 || lcm % b!=0)
        {
            lcm++;
        }
        System.out.println(lcm);
    }
    
}
