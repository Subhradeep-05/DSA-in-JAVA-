class Shape{
    void area(){
        System.out.println("It prints area of respective shape");
    }

    void perimeter(){
        System.out.println("It prints perimeter of respective shape");

    }
}

class circle extends Shape{
    @Override
    void area(){
        System.out.println("Prints area of the circle");
    }

    @Override
    void perimeter(){
        System.out.println("It prints perimeter of circle shape");

    }
}



class rectangle extends Shape{
    @Override
    void area(){
        System.out.println("Prints area of the rectangle");
    }

    @Override
    void perimeter(){
        System.out.println("It prints perimeter of rectangle shape");

    }
}


class triangle extends Shape{
    @Override
    void area(){
        System.out.println("Prints area of the triangle");
    }

    @Override
    void perimeter(){
        System.out.println("It prints perimeter of triangle shape");

    }
}



public class mainshape {
    public static void main(String args[]){
        Shape a1 = new circle();
        a1.area();
        a1.perimeter();

        Shape a2 = new rectangle();
        a2.area();
        a2.perimeter();

        Shape a3 = new triangle();
        a3.area();
        a3.perimeter();

    }
}
