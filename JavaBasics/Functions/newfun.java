import java.util.*;

public class newfun {
    public static void printhelloworld(){
        System.out.println("Hello World");
    }
    
    public static void calculatesum(int num1, int num2){//parameters 
        int sum = num1 + num2;
        System.out.println("Sum is: "+ sum);
    }

    public static void swapchange(int a, int b){
          int temp = a;
        a = b;
        b = temp;

        System.out.println("a is: "+a);
        System.out.println("b is: "+b);
       
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        swapchange(a, b);
        
       //swap
      
    }
}
