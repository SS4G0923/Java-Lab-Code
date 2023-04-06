package Lab6.tsk5;

public class E {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5,3);
        Shape tri = new Triangle(5,3);
        System.out.println("矩形的面积" + rect.getArea());
        System.out.println("矩形的周长" + rect.getLength());
        System.out.println("三角形的面积" + tri.getArea());
        System.out.println("三角形的周长" + tri.getLength());
    }
}
