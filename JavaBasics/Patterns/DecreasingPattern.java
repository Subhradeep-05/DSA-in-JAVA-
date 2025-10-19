import java.util.*;

public class DecreasingPattern {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number of rows");
        int n  = sc.nextInt();

        for(int i = 1; i<=n; i++ ){
            for(int star=1 ;star<= (n-i+1);star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
