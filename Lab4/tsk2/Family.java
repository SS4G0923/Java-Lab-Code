package tsk2;

class Family {
    TV homeTV;

    void buyTV(TV t){
        homeTV = t;
    }

    void watchTV(){
        homeTV.showProgram();
    }

    void remoteControl(int i){
        homeTV.setChannel(i);
    }
}
