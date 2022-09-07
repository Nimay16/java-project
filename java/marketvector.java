import java.util.*;

public class marketvector {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector v=new Vector();
        int i,a,list=0;
        String b,c;
        System.out.println("Enter the number of element in the list: ");
        int n=sc.nextInt();
        System.out.println("Enter the element of the list: ");
        for( i=0;i<n;i++)
        {
            v.add(sc.next());
        }
       while(list!=4)
       {
            System.out.println("1.Add\n2.Remove\n3.display\n4.Exit");
            System.out.println("Enter the choise:");
            list=sc.nextInt();
            switch(list)
            {
                case 1:
                    System.out.println("Enter the index at which the item has to be added: ");
                    a=sc.nextInt();
                    System.out.println("Enter the item to be added to the list: ");
                    b=sc.next();
                    v.add(a,b);
                    break;
                    
                case 2:
                    System.out.println("Enter the item to be removed from the list: ");
                    c=sc.next();
                    v.remove(c);
                    break;
                case 3:
                    for( i=0;i<v.size();i++)
                    {
                        System.out.println(v.get(i) );
                    }
                    break;
                
                case 4:
                    return ;


                    
            }
        }
       


    }
    
}
