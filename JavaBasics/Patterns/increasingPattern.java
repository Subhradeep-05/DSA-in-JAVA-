import java.util.*;
public class increasingPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        for(int i = 1; i<=4; i++){
            for(int star = 1; star<=i ; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
