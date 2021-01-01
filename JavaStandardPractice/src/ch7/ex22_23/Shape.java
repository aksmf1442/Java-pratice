package ch7.ex22_23;

public abstract class Shape {
    Point p;

    public Shape(){
        this(new Point(0, 0));
    }

    public Shape(Point p){
        this.p = p;
    }

    abstract double calcArea();

    public Point getPosition(){
        return p;
    }

    public void setPosition(Point p){
        this.p = p;
    }
}
