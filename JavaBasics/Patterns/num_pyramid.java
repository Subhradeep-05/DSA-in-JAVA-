import java.util.Scanner;

public class num_pyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wrote the number of rows: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int num = 1; num <= i; num++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
