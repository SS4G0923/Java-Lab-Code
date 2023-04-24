package Lab8.tsk4;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.fly();
        Bird bird = new Bird();
        bird.fly();
        MakeFly m = bird;
        m.makeFly();
        m = plane;
        m.makeFly();
    }
}
