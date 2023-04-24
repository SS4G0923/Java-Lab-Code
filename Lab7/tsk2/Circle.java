package Lab7.tsk2;

public class Circle extends Geometry {
    double radius;

    public Circle(double r) {
        radius = r;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
