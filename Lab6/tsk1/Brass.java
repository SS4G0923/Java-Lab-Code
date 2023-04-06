package Lab6.tsk1;

public class Brass extends Instrument{

    @Override
    public void play() {
        System.out.println("弹奏Brass");
    }

    public void play2(){
        System.out.println("调用brass的play2");
    }
}
