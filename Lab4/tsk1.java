class Vehicle{
    private double speed = 0.0f;
    private int power;

    void speedUp(double s){
        speed += s;
    }

    void speedDown(double d){
        speed -= d;
    }

    double getSpeed(){
        return speed;
    }

    void setPower(int p){
        power = p;
    }

    int getPower(){
        return power;
    }
}
public class tsk1 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.setPower(100);
        v.speedUp(100.0);
        System.out.println("当前速度为：" + v.getSpeed());
        v.speedDown(50.0);
        System.out.println("当前速度为：" + v.getSpeed());
    }
}
