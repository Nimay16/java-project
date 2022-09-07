import java.util.*;
public class fibonacci 
{
    static int n,f1=0,f2=1,f3;
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		n = sc.nextInt();
		System.out.println("The fibonacci series is: ");
		System.out.println(" "+f1);
		System.out.println(" "+f2);
		fibonacci(n-2);
	}
	
	public static void fibonacci(int count){
	    if(count!=0)
	    {
	        f3 = f1 + f2;
	        f1 = f2;
	        f2 = f3;
	        System.out.println(" "+f3);
	        fibonacci(count-1);
	    }
      
    }
}
