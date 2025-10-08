import java.util.*;
public class DoWhile{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    //     int Counter = 1;
    //     do{
    //         System.out.println("Hello world");
    //         Counter++;
    //     }while(Counter<=10);

        //till the user don't write the multiple of 10
        // do{
        //     int n = sc.nextInt();
        //     System.out.println(n);
        //     if(n%10 == 0){
        //         System.out.println("Getting out of the loop");
        //         break;
        //     }
        //     else{
        //         System.out.println("Tru again until it will a multiplier of 10");
        //         continue;
        //     }
        // }while(true);


        do{
            int n = sc.nextInt();
            System.out.println(n);
            if(n%10 == 0){
                System.out.println("Getting out of the loop");
                continue;
            }
            // else{
            //     System.out.println("Tru again until it will a multiplier of 10");
            //     continue;
            // }
        }while(true);
    }
}