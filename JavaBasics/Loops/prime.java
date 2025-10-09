import java.util.*;
public class prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean isPPrime = true;
        int n = sc.nextInt();
        for(int i=2; i<=n-1; n++){
            if(n % i == 0){
                isPPrime = false;
            }
        }

        if(isPPrime == true){
            System.out.println("The number is prime");
        }

        else{
            System.out.println("The given number is not prime");
        }
    }
}
