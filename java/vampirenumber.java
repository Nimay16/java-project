import java.util.*;                                                       
public class vampirenumber                                             
{                                                              
    public static void main(final String[] args)                                    
    {
        int arr[],i,x,j,k,l;
        boolean f=true;
        arr=new int[4];                              
        final Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Digits of four Digit Number:");                         
        for(i=0;i<4;i++)
        {
            arr[i]=sc.nextInt();                     
        } 
        x=1000*arr[0]+100*arr[1]+10*arr[2]+arr[3];
        System.out.println("Number entered is :"+x);                        
        for(i=0;f && i<4;i++)
        {
            for(j=0;j<4;j++)
            {                        
                for(k=0;k<4;k++)
                {
                    for(l=0;l<4;l++)
                    {                      
                        if(i!=j && i!=k && i!=l && j!=k && j!=l && k!=l)
                        {
                            if(x==(arr[i]*10+arr[j])*(arr[k]*10+arr[l]))
                            f=false;                                                            
                         }
                   
                    }
                }
            }
         }
        if(f==false)
   
        System.out.println("The given number is a Vampire ");
       
         else
       
        System.out.println("The given is not a Vampire ");
       
        
    }
}
