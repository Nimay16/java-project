import java.util.*;


class rectangle
{
    rectangle(int length,int breath)
    {
        int area=length*breath;
        System.out.println("Area of Rectangle: "+area);
    }
}
class cube
{
    cube(int side)
    {
        int vol=side*side*side;
        System.out.println("Volume of Cube: "+vol);
    }
}
class Size
{
    Scanner sc=new Scanner(System.in);

    void size(String z)
    {
        int l,b,s;
        if(z.equalsIgnoreCase("rectangle"))
        {
            System.out.println("Enter the value of length:");
            l=sc.nextInt();
            System.out.println("Enter the value of breath:");
            b=sc.nextInt();
            rectangle r=new rectangle(l,b);
        }
        else if(z.equalsIgnoreCase("cube"))
        {
            System.out.println("Enter the value of side:");
            s=sc.nextInt();
            cube c=new cube(s);
        }
        else 
        {
            System.out.println("Wrong shape entered");
        }

    }
}

public class constructor 
{
    public static void main(String[] args) {
        String shape;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the shape:");
        shape=sc.next();
        Size s=new Size();
        s.size(shape);

    }   
}
