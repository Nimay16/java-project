import java.util.*;
public class irregulararray 
{
    public static void main(String[] args) {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of rows: ");
        n=sc.nextInt();
        int arr [][]=new int[n][];
        for( i=0;i<n;i++)
        {
            arr[i] = new int[i+1];
        }
        for( i=0; i<n; i++)
        {
            for( j=0;j<arr[i].length;j++)
            {
                System.out.println("Enter value:");
                arr[i][j] = sc.nextInt();
            }
        }
        for( i=0; i<n; i++)
        {
            for(j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
