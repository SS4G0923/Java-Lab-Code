package Lab7.tsk3;

public class CompanySalary {
    public static void main(String[] args) {
        Company cmp = new Company();
        for(int i = 0; i < 30; i++){
            if(i % 3 == 0) cmp.empArray[i] =  new YearWorker();
            else if(i % 3 == 1) cmp.empArray[i] = new MonthWorker();
            else cmp.empArray[i] = new WeekWorker();
        }

        double sum = 0;
        for(int i = 0; i < 30; i++){
            sum += cmp.empArray[i].earnings();
        }

        System.out.println("公司需支付的薪水总额为：" +  sum + "元");
    }
}
