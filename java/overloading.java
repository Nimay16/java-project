import java.util.*;
class overloading
{
	static double area(double s)
	{
		return s*s;
	}

	static double area(double l, double b)
	{
		return l*b;
	}

    public static void main(String[] args) 
    {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the type of figure\n1 - Square\n2 - Rectangle\nEnter your choice: ");
		int choice = sc.nextInt();

		if(choice == 1)
		{
			System.out.print("Enter the length of one side of the square: ");
			double s = sc.nextFloat();
			System.out.println("The area of the square is " + area(s));

		}

		else if (choice == 2)
		{
			System.out.print("Enter the length of the rectangle :");
			double l = sc.nextFloat();

			System.out.print("Enter the breadth of the rectangle: ");
			double b = sc.nextFloat();

			System.out.println("The area of the rectangle is " + area(l, b));
		}

		else
		{
			System.out.println("Invalid Input. Terminating process...");
		}


	}
}