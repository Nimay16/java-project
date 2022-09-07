import java.util.*;
public class frequency {
    public static void main(String[] args)
    {
        int count = 0;
        int i = 0;
        String val;
        Scanner sc = new Scanner(System.in);
        Vector<String> v = new <String>Vector();
        System.out.println("Enter the number of element in the list: ");
        int n=sc.nextInt();
        System.out.println("Enter the element of the list: ");
        for( i=0;i<n;i++)
        {
            v.add(sc.next());
        }
        System.out.print("Enter the element to be checked for: ");
        val  = sc.next(); 
        for(i=0; i<v.size(); i++)
        {
            if(v.get(i).equals(val))
            {
                count++;
            }
        }
        System.out.println("Entered element has frequency of "+count);
    }
}
    

