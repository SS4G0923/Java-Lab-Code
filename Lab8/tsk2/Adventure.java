package Lab8.tsk2;

public class Adventure {
    public static void main(String[] args) {
        Hero hb = new Hero("Superman");
        hb.swim();
        hb.fight("Evils");
        hb.fly();
        CanFly cf = hb;
        cf.fly();
        CanSwim cs = hb;
        cs.swim();
        ActionCharacter ac = hb;
        ac.fight("Evils");
        ac.speak("Hello");
    }
}
