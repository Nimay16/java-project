import java.util.*;
public class marks 
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns");
        int col = sc.nextInt();

        int arr[] [] = new int[10][10];
        System.out.println("Enter the numbers below: ");
        for(int r=0; r<row; r++) 
        {
            for(int c=0; c<col; c++) 
            {
                System.out.print("INPUT ["+ r +"] ["+ c +"] = ");
                arr[r][c] = sc.nextInt();
            }
        }
        System.out.println("\nThe matrix generated is: ");

        
        int r;
        int c;
        for(r=0; r<row; r++) {
            int tempRow = 0;
            for(c=0; c<col; c++) {
                tempRow += arr[r][c];
            }
            arr[r][c] = tempRow;
        }
        
        for(c=0; c<=col; c++) {
             int tempCol= 0;
            for(r=0; r<row; r++) {
                tempCol += arr[r][c];
            }
            arr[r][c] = tempCol;
        }

        
        for(r=0; r<=row; r++) {
            for(c=0; c<=col; c++) {
                System.out.print( arr[r][c] + " ");
            }
            System.out.println();
        }

    }
}
