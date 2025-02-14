interface Shape{
    double getArea();
}


class Rectangle implements Shape{
    private double length,breadth;

    public Rectangle(double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }

    @Override
    public double getArea(){
        return length*breadth;
    }
}


class Circle implements Shape{
    private double radius;

    public Circle(double radius)
    {
        this.radius=radius;
    }

    @Override
    public double getArea(){
        return 3.14*radius*radius;
    }
}

class Triangle implements Shape{
    private double  base,height;

    public Triangle(double base,double height)
    {
        this.base=base;
        this.height=height;
    }

    @Override
    public double getArea(){
        return 0.5*base*height;
    }
}

public class prg8 {
    public static void main(String[] args) {
        Shape triangle=new Triangle(10, 29);
        Shape circle=new Circle(7);
        Shape rectangle=new Rectangle(26,9);

        System.out.println("Triangle area: "+ triangle.getArea() +"\n"+"Circle area: "+ circle.getArea() +"\n"+"Rectangle area is:"+ rectangle.getArea() );
    }
}
