package Lab3;

class Point{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    int getX(){
        return x;
    }

    int getY(){
        return y;
    }
}
public class tsk5 {
    public static void main(String[] args) {
        Point p1 = new Point(2,3);
        int x = p1.getX();
        int y = p1.getY();
        System.out.println("X为：" + x + "，Y为：" + y);
    }
}
