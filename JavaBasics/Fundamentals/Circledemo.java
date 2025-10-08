
class Circle {
    double x, y, r;
    
    double circumference(){
        return 2*3.14*r;
    };

    double area(){
        return 3.14*r*r;
    };
}

class Circledemo {
    public static void main(String args[]){
        Circle c = new Circle();
        c.x = 0.0;
        c.y = 0.0;
        c.r = 12.15;

        System.out.println("Cicumference of the circle is:  "+ c.circumference());
        System.out.println(("Area of the circle is: "+ c.area()));
    }
    
}
