import java.util.*;
public class prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;
        for(int i=2; i<n-1; i++){
            if(n%i == 0){
                isPrime = false;
            }
        }

        if(isPrime=true){
            System.out.println("The number is a prime number. The number you typed is: "+ n);

        }
        else{
            System.out.println("It is not a prime number.");
        }
        
    }
}
