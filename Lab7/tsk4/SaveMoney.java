package Lab7.tsk4;

public class SaveMoney {
    public static void main(String[] args) {
        Bank.savedMoney = 8000;
        ConstructionBank c = new ConstructionBank();
        GuangZhouBank g = new GuangZhouBank();
        c.year = 8.236;
        g.year = 8.236;
        double cInterest = c.computerInterest();
        double gInterest = g.computerInterest();
        double differ = gInterest - cInterest;
        System.out.println("差额为：" + differ + "元");
    }
}
