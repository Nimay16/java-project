import java.util.*;
public class sumofnumbers 
{
    public static void main(String[] args) 
    {
            int sum, n;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of n: ");
            n = sc.nextInt();
            sum = sum(n);
            System.out.print("The sum is: "+sum);
    } 
    public static int sum(int n){
	    if(n!=0)
	    {
	        return n + sum(n-1);
	    }
	    else
	    {
	        return n;
	    }
	}  
}
