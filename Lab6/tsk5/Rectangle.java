package Lab6.tsk5;

public class Rectangle extends Shape{

    Rectangle(double bottom, double height){
        this.bottom = bottom;
        this.height = height;
    }
    @Override
    public double getArea() {
        return bottom * height;
    }

    @Override
    public double getLength() {
        return ( bottom + height ) * 2;
    }
}
