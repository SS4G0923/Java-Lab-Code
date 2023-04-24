package Lab7.tsk4;

public class Bank {
    static int savedMoney;
    int year;
    double interest;

    public double computerInterest(){
        interest = year * 0.35 * savedMoney;
        return interest;
    }
}
