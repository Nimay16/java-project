import java.util.*;
 
abstract class calculateArea {
    abstract void Triangle(double b, double h);
    abstract void Rectangle(double l, double b);
    abstract void Circle(double r);
}
 
class findArea extends calculateArea {
 
    void Triangle(double b, double h)
    {
        double area = (b*h)/2;
        System.out.println("Area of Triangle: "+area);
    }
 
    void Rectangle(double l, double b)
    {
        double area = l*b;
        System.out.println("Area of Rectangle: "+area);
    }
     
    void Circle(double r)
    {
        double area = 3.14*r*r;
        System.out.println("Area of Circle: "+area);
    }
}
         
class Abstract {
    public static void main(String args[])
    {
        double l, b, h, r;
        findArea area = new findArea();
        Scanner sc = new Scanner(System.in);
        System.out.println("**MAIN MENU**");
        System.out.println("1.Triganle");
        System.out.println("2.Rectangle");
        System.out.println("3.Cirle");
        System.out.println("Enter the option:");
        int option=sc.nextInt();
        switch(option)
        {
            case 1:
            System.out.print("\nEnter Base & Vertical Height of Triangle: ");
            b = sc.nextDouble();
            h = sc.nextDouble();
            area.Triangle(b, h);
            break;
 
            case 2:
            System.out.print("\nEnter Length & Breadth of Rectangle: ");
            l = sc.nextDouble();
            b = sc.nextDouble();
            area.Rectangle(l, b);
            break;

            case 3:
            System.out.print("\nEnter Radius of Circle: ");
            r = sc.nextDouble();
            area.Circle(r);
            break;

        }    
    }
}   