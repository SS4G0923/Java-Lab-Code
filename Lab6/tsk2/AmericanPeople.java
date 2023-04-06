package Lab6.tsk2;

public class AmericanPeople extends People{
    @Override
    public void speakHello(){
        System.out.println("Hello");
    }
    @Override
    public void averageHeight(){
        System.out.println(height);
    }
    @Override
    public void averageWeight(){
        System.out.println(weight);
    }
    public void americanBoxing(){
        System.out.println("直拳，勾拳");
    }
}
