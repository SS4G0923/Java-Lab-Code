package Lab7.tsk2;

public class Application {
    public static void main(String[] args) {
        Pillar pillar;
        Geometry bottom = null;
        pillar = new Pillar(bottom, 100);
        System.out.println("体积" + pillar.getVolume());
        bottom = new Rectangle(12, 22);
        pillar = new Pillar(bottom, 58);
        System.out.println("体积" + pillar.getVolume());
        bottom = new Circle(10);
        pillar = new Pillar(bottom, 58);
        System.out.println("体积" + pillar.getVolume());
    }
}
