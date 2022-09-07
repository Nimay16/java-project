import java.util.*;
class Area 
{
    Area(int length,int breath)
    {
        int area_rectangle=length*breath;
        System.out.println("Area of rectangle is: "+area_rectangle);
    }
    Area(int side)
    {
        int area_square=side*side;
        System.out.println("Area of square is: "+area_square);
    }
}
class constructoroverloading
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of the Square: ");
        int s=sc.nextInt();
        System.out.println("Enter the length of the Rectangle: ");
        int l=sc.nextInt();
        System.out.println("Enter the breath of the Rectangle: ");
        int b=sc.nextInt();
        
        Area square=new Area(s);
        Area rectangle=new Area(l,b);


    }

}

