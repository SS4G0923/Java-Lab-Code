package tsk2;

public class MainClass {
    public static void main(String[] args) {
        TV haierTV = new TV();
        Family myFamily = new Family();
        myFamily.homeTV = haierTV;
        myFamily.buyTV(haierTV);
        myFamily.remoteControl(2);
        myFamily.watchTV();
        myFamily.remoteControl(5);
        myFamily.watchTV();
    }
}
