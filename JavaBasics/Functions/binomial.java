

public class binomial {
    public static int fact(int n){
        int f =1;
        for(int i =1;i<=n;i++){
             f *= i; 
        }
        return f;
    }

    public static int binco(int n, int r){
        int n_fact = fact(n);
        int r_fact = fact(r);
        int nmr = fact(n-r);

        int binfactori = n_fact/(r_fact*nmr);

        return binfactori;
    }

    public static void main(String args[]){
        
        System.out.println("Binomial Factorial of the number is: "+ binco(5, 3));

        
        
    }
}
