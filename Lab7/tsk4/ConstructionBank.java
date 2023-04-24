package Lab7.tsk4;

public class ConstructionBank extends Bank{
    double year;

    @Override
    public double computerInterest() {
        super.year = (int) year;
        super.computerInterest();
        return super.interest + ( year - (int)year ) * 0.03 * savedMoney;
    }
}
