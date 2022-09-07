import java.util.*;
public class metastring 
{
    static boolean areMetaStrings(String a, String b) 
    { 
        int n1 = a.length(); 
        int n2 = b.length();  
        if (n1 != n2) 
            return false; 

        int pre = -1, cur = -1; 
       
        int count = 0; 
        for (int i=0; i<n1; i++) 
        { 
            if (a.charAt(i) != b.charAt(i)) 
            {
                count++; 

                if (count > 2) 
                    return false;
                pre = cur; 
                cur = i; 
            } 
        } 
    
        return (count == 2 && a.charAt(pre) == b.charAt(cur) && a.charAt(cur) == b.charAt(pre)); 
    } 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in);
        String a,b;
        System.out.println("Enter the first string ");
        a=sc.next();
        System.out.println("Enter the Second string ");
        b=sc.next();
       
        System.out.println(areMetaStrings(a,b) ? "Entered strings are meta strings" :"Entered strings are not meta strings"); 
    } 
}
      