import java.util.*;
class student
{
    int rollno;
}
class test extends student
{
    int sem1_marks,sem2_marks;
}
interface sports
{
    void score();
}
class result extends test implements sports
{
    result(int r,int sem1,int sem2)
    {
        rollno=r;
        sem1_marks=sem1;
        sem2_marks=sem2;    
    }
    void display()
    {
        System.out.println("Roll number:"+rollno);
        System.out.println("Sem 1 marks:"+sem1_marks);
        System.out.println("Sem 2 marks:"+sem2_marks);
    }
    public void score()
    {
        int total=sem1_marks+sem2_marks;
        System.out.println("Total marks is "+total);
    }
}
public class inheritance 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the roll number of the student:");
        int a=sc.nextInt();
        System.out.println("Enter the sem 1 marks of the student:");
        int b=sc.nextInt();
        System.out.println("Enter the sem 2 marks of the student:");
        int c=sc.nextInt();
        result R=new result(a,b,c);
        R.display();
        R.score();

    }
}
