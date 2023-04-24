package Lab8.tsk4;

public class Bird implements CanFly, MakeFly{
        @Override
        public void fly() {
            System.out.println("Bird is flying");
        }

        @Override
        public void makeFly() {
            System.out.println("Bird is flying");
        }

}
