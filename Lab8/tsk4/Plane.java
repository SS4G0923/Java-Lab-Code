package Lab8.tsk4;

public class Plane implements CanFly, MakeFly{
    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }

    @Override
    public void makeFly() {
        System.out.println("Plane is flying");
    }
}
