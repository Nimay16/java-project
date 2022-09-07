import java.util.*;
public class xraisedtoy 
{
    public static void main(String[] args) 
    {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        System.out.print("Enter the power: ");
        int y = sc.nextInt();
        int result = raised(x, y);
        System.out.println("The answer is: " + result);
    }

    public static int raised(int x, int y)
    {
        if(y > 0)
        {
            y--;
            return x * raised(x, y);
        }
        else
        {
            return 1;
        }
    }   
}
