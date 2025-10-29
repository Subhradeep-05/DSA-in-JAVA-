class bank{
    int var;
    void deposit(){
        System.out.println("Your amount is deposit");
    }

    void withdraw(){
        System.out.println("It gives the withdrawal amount");
    }
}

class SavingsAccoun extends bank{
    void withdraw(){
        System.out.println(" allows limited withdrawals with no extra fee. ");
    }
    
}

class CheckingAccount extends bank{
    void withdraw(){
        System.out.println("charges a small transaction fee for each withdrawal.");
    }
}


public class Bankdetails {
    public static void main(String args[]){
        bank a1 = new SavingsAccoun();
        a1.withdraw();

        bank a2 = new CheckingAccount();
        a2.withdraw();
    }



}
