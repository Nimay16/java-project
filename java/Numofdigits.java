public class Numofdigits 
{
    public static void main(String args[]) {
        int num;
        int length=0;
         num=Integer.parseInt(args[0]);
        System.out.println("Number of entered is: "+args [0]);
        while(num/10!=0){
            num=num/10;
            length++;
        }
        length++;
        System.out.println("Length of the number is : "+length);
    }   
}
