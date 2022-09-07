import java.util.*;
public class gcdlcm 
{
     public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Enter the first number whose GCD you want to find: ");
        a=sc.nextInt();
        System.out.println("Enter the second number whose GCD you want to find: ");
        b=sc.nextInt();
        System.out.println("GCD of "+a+" and "+b+" is "+gcd(a,b));
        System.out.println("Enter the first number whose LCM you want to find : ");
        c=sc.nextInt();
        System.out.println("Enter the second number whose LCM you want to find: ");
        d=sc.nextInt();
        System.out.println("LCM of "+c+" and "+d+" is "+lcm(c, d));
    }
    static int gcd(int a, int b)
    {
        
        if (a == 0)
        {
            return b;
        }
        if (b == 0)
        {  
            return a;
        }
        if (a == b)
        {
            return a;
        }
        if (a > b)
        {
            return gcd(a-b, b);
        }       
        else
        {
            return gcd(a, b-a);
        }
    }
    static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }
     
    
}
