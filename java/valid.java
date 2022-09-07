import java.util.*;
class valid
{
   public static void main(String[] args)
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        String n=sc.next();

        try
        {
            Integer.parseInt(n);
	        System.out.println(n+" is valid number");
        }
        catch(NumberFormatException e)
        {
	        System.out.println("invalid number");
        }
   }
}