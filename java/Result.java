import java.util.*;
class MarksOutofBond extends Exception
{
	MarksOutofBond(String p)
	{
		super(p);
	}
}
class Result
{
	
public static void validate(int s) throws MarksOutofBond
{

	if (s<0 || s>100)
	{
		throw new MarksOutofBond("Invalid marks");

	}
	else
	{
		System.out.println("Marks are "+s);
	}

}

public static void main(String args[])
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String n=sc.next();
		System.out.println("Enter the Seat no.");
		int s=sc.nextInt();
		System.out.println("Enter the center number");
		int c=sc.nextInt();
		System.out.println("Enter the Date");
		String d=sc.next();
		System.out.println("Enter the marks of subject ");
		int x=sc.nextInt();
		System.out.println("Name:"+n);
		System.out.println("Seat no.:"+s);
		System.out.println("Center no.:"+c);
		System.out.println("Date:"+d);
		try
		{
			validate(x);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}