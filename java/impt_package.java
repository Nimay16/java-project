import java.util.*;
import Add.*;
public class impt_package 
{
    public static void main(String[] args) {
        Add.Addition obj = new Add.Addition();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        System.out.println("Enter a number");
        int b=sc.nextInt();
        obj.add(a,b);
    }   
}
