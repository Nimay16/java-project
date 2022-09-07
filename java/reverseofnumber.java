import java.util.*;
public class reverseofnumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse: ");
        int n = sc.nextInt();
        System.out.print("The reversed number is: ");
        reverse(n);
    } 
    public static void reverse(int i)
    {
        if(i < 10)
	    {
	        System.out.println(i);
            return;
	    }
	    else
	    {
	        System.out.print(i % 10);
            reverse(i/10);
	    }
    }  
}
