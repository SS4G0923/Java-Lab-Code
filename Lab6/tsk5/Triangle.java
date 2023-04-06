package Lab6.tsk5;

public class Triangle extends Shape{
    Triangle(double bottom, double height){
        this.bottom = bottom;
        this.height = height;
    }
    @Override
    public double getArea(){
        return bottom * height * 1/2;
    }

    @Override
    public double getLength() {
        return 3 * bottom;
    }
}
