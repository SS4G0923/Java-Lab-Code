package Lab5.tsk2;

public class Triangle {
    private double sideA, sideB, sideC;
     public double getArea(){
        double p = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return area;
    }

    public void setSides(double a, double b, double c){
        sideA = a;
        sideB = b;
        sideC = c;
    }
}
