package Lab7.tsk4;

public class GuangZhouBank extends Bank{
    double year;

    @Override
    public double computerInterest() {
        super.year = (int) year;
        super.computerInterest();
        return super.interest + ( year - (int)year ) * 0.04 * savedMoney;
    }
}
