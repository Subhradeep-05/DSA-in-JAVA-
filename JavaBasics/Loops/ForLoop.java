import java.util.*;
public class ForLoop {
    public static void main(String args[]){
        //print square pattern
        // for(int lines = 1; lines <= 4; lines++ ){
        //     System.out.println("****");
        // }


        //Print reverse of a number
        int n = 210905;
        while (n > 0) {
            int LastDigit = n%10;
            System.out.print(LastDigit + " ");
            n /= 10;
            
        }
        System.out.println();
    }

}
