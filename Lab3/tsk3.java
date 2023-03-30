
class Circle{
    double radius;
    double round;
    double area;

    double getRound(){
        round =  2 * radius * 3.14;
        return round;
    }

    double getArea(){
        area =  radius * radius * 3.14;
        return area;
    }

    void setRadius(double r){
        this.radius = r;
    }
}

public class tsk3 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(3);
        double area = c1.getArea();
        double round = c1.getRound();
        System.out.println("面积为：" + area + "，周长为：" + round);
    }
}
