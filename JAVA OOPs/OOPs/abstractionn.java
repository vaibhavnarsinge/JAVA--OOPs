
class rectangle extends ABS{

    void Shape()
    {
        System.out.println("Shape of rectangle has four sides\n");
    }

    void Area()
    {
        System.out.println("Area of rectangle  = Length X width");
    }

    
}

class circle extends ABS{

    void Shape()
    {
        System.out.println("\n\nShape of Circle");
    }

    void Area()
    {
        System.out.println("Area of circle  = 2pi*r*");
    }

    
}


public class abstractionn {

    public static void main(String args[])
    {
        rectangle rrr = new rectangle();
        rrr.Area();
        rrr.Shape();
        ABS rectangle = new rectangle();
        rectangle.Area();
        rectangle.Shape();

        ABS rectangle1 = new circle();
        rectangle1.Area();
        rectangle1.Shape();



    }
}
