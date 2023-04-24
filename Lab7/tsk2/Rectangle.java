package Lab7.tsk2;

public class Rectangle extends Geometry{
    double width;
    double height;

    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
