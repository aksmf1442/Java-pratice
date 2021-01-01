package ch7.ex22_23;

public class Circle extends Shape{
    double r;

    public Circle(double r){
        this(new Point(0, 0), r);
    }

    public Circle(Point p, double r){
        super(p);
        this.r = r;
    }

    @Override
    double calcArea() {
        return Math.PI * r * r;
    }
}
