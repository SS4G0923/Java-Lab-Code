package Lab8.tsk1;

public class Cat implements Animal{

    String name;

    public Cat (String name){
        this.name = name;
    }

    @Override
    public void cry() {
        System.out.println("Cat " + name + " is meowing");
    }

    @Override
    public String getAnimalName() {
        return name;
    }
}
