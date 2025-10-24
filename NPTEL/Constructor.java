

class SimpleInterest{
    double n, p, r;
    double si(){
        return n*p*r;
    }
}


class Constructor{
    public static void main(String args[]){
        SimpleInterest c = new SimpleInterest();
        
        c.n = 10000;
        c.p = 15.0;
        c.r = 7.8;

        System.out.println("Simple interest is" + c.si());
    }
}