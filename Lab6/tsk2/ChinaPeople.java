package Lab6.tsk2;

public class ChinaPeople extends People{

    @Override
    public void speakHello(){
        System.out.println("你好");
    }
    @Override
    public void averageHeight(){
        System.out.println(height);
    }
    @Override
    public void averageWeight(){
        System.out.println(weight);
    }
    public void chinaGongfu(){
        System.out.println("坐如钟，站如松，睡如弓");
    }
}
