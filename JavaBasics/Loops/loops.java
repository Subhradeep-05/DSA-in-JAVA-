import java.util.*;
public class loops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the terms you want ti print: ");
        int n = sc.nextInt() ;
        int Counter = 1;
        //  while(Counter<100){
        //      System.out.println("Hello World");
        //      Counter++;
        //  }

        //print 1 to 10
        // while(Counter<=10){
        //      System.out.println(Counter);
        //      Counter++;
        //  }
        //  System.out.println("1 to 10 printed");

        //from 1 to n numbers
        // while(Counter<=n){
        //      System.out.println(Counter);
        //      Counter++;
        //  }


        //Sum of n natural numbers
        int i = 1;
        int sum = 0;

        while(i<=n){
             sum += i;
             i++;
         }
         System.out.println("The sum of n numbers is: "+ sum);
    }
    
}
