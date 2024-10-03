
import java.util.Scanner;

public class arrayPrac{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int s = sc.nextInt();

        int [] marks = new int[s];

        for(int i = 0 ; i<marks.length ; i++){
            marks[i] = sc.nextInt();
        }
        
        int o = sc.nextInt();
        int idx = -1;
        for(int i = 0 ; i<marks.length ; i++){
            if (marks[i] == o){
                idx = i;
                System.out.println("No. found " + o + " at index " + idx);
            } 
        }
    }
}