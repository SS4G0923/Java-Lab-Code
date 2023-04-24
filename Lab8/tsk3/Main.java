package Lab8.tsk3;

public class Main {
    public static void main(String[] args) {
        UseCompute  uc = new UseCompute();
        uc.useCom(new Add(), 1, 2);
        uc.useCom(new Subtract(), 10, 6);
        uc.useCom(new Multiply(), 3, 4);
        uc.useCom(new Divide(), 12 , 4);
    }
}
