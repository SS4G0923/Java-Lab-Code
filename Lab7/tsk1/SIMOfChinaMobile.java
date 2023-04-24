package Lab7.tsk1;

public class SIMOfChinaMobile extends SIM{
    String number;

    @Override
    public void setNumber(String n) {
        number = n;
    }

    @Override
    public String giveNumber() {
        return number;
    }

    @Override
    public String giveCorpName() {
        return "中国移动";
    }
}
