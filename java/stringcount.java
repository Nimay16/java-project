import java.util.*;
import java.io.*;
import java.lang.*;

public class stringcount 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
       String str = sc.nextLine();

      int v=0 , c=0 , s=0 , special=0 , d=0 ,w=0 , a=0 ;
    

       int  total_size = str.length() ;  
       str = str.toLowerCase() ;

       System.out.println(" the String: "+ str);
       System.out.println(" the length: "+ total_size);


       for(int i=0 ; i<total_size ; i++){
           char ch = str.charAt(i);

           if(ch>='a' && ch<='z'){
            a++ ;

              if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                v++ ;
              }else{
                c++;
              }

            }else if(ch>='0' && ch<='9'){
                  d++ ;
            
            }else if(ch==' '){
                s++ ;   w++ ;

                if(str.charAt(i-1) ==' '){
                    w-- ;
                }

            }else{
                special++ ;  
            }


           }

           System.out.print("\n Alphabets : "+ a);
           System.out.print("\n Vowels : "+ v);
           System.out.print("\n Consonants : "+ c);
           System.out.print("\n Spaces : "+ s);
           System.out.print("\n Digits : "+ d);
           System.out.print("\n Special Cases : "+ special);
           System.out.print("\n Words : "+ (s+1));
  
    }
    
}
