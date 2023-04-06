package Lab5;
import Lab5.tsk2.Triangle;
public class tsk2_main extends Triangle{
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.setSides(30, 40, 50);
        System.out.println(t.getArea());
    }
}

