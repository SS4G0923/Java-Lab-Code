package Lab7.tsk2;

public class Pillar {
    Geometry bottom;
    double height;
    Pillar (Geometry bottom, double height){
        this.bottom = bottom;
        this.height = height;
    }
    public double getVolume(){
        if(bottom == null) {
            System.out.println("没有底，无法计算体积");
            return -1;
        }
        return bottom.getArea() * height;
    }
}
