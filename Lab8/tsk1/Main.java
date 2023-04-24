package Lab8.tsk1;

public class Main {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        Cat cat = new Cat("Murzik");
        Dog dog = new Dog("Sharik");
        simulator.playSound(cat);
        simulator.playSound(dog);
    }
}
