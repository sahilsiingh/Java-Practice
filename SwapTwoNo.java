import java.util.Scanner;
public class SwapTwoNo{
    public static void main(String[] args){
        int x , y , temp;
        Scanner s = new Scanner (System.in);
        System.out.print("Enter first number:");
        x = s.nextInt();
        System.out.print("Enter second number:");
        y = s.nextInt();

        temp = x; 
        x= y; 
        y = temp;

        System.out.println("After swapping");
        System.out.println("First no:" +x);
        System.out.println("Second no:"+y);

        s.close();
    }
}
