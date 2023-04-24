package Lab8.tsk2;

public class Hero extends ActionCharacter implements CanFly, CanSwim{
    String name;
    public Hero(String name){
        this.name = name;
    }
    @Override
    public void fight(String emp) {
        System.out.println("Hero " + name + " is fighting " + emp);
    }
    @Override
    public void fly() {
        System.out.println("Hero " + name + " is flying");
    }
    @Override
    public void swim() {
        System.out.println("Hero " + name + " is swimming");
    }
}
