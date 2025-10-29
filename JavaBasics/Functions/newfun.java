import java.util.*;

public class newfun {
    public static void printhelloworld(){
        System.out.println("Hello World");
    }
    
    public static void calculatesum(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("Sum is: "+ sum);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
        int b = sc.nextInt();
        calculatesum(a, b);
    }
}
