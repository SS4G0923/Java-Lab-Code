package Lab8.tsk1;

public class Dog implements Animal{

    String name;

    public Dog(String name){
        this.name = name;
    }

    @Override
    public void cry() {
        System.out.println("Dog " + name + " is barking");
    }

    @Override
    public String getAnimalName() {
        return name;
    }
}
