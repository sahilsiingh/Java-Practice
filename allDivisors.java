
public class allDivisors {

    public static void main(String[] args) { 
        int div = 0;    
        int n = 64;  
        for (int i = 1; i <= n; i++) { 
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }

    }
}
