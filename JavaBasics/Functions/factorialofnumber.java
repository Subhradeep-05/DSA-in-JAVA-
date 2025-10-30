public class factorialofnumber {
    public static int fact(int n){
        int f =1;
        for(int i =1;i<=n;i++){
             f *= i; 
        }
        return f;
    }

    public static void main(String args[]){
        int realfact = fact(3);
        System.out.println("The Factorial of the number is: "+ realfact);
    }
}
