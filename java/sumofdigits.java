import java.util.*;
public class sumofdigits 
{
    public static void main(String[] args) {
        int n,sum;
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the number: ");
	    n = sc.nextInt();
	    sum = sum_of_digits(n);
	    System.out.print("The sum of digits of "+n+" is "+sum);
    }   


public static int sum_of_digits(int num){
	    if(num!=0)
	    {
	        return (num%10 + sum_of_digits(num/10));
	    }
	    else
	    {
	        return num;
	    }
    }
}