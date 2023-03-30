package tsk2;

class TV {
    int channel;

    void setChannel(int i){
        channel = i;
    }

    int getChannel(){
        return channel;
    }

    void showProgram(){
        String cur_program = "无";
        if(channel == 1) cur_program = "1经济频道";
        else if(channel == 2) cur_program = "2体育频道";
        else if(channel == 3) cur_program = "3综艺频道";
        else if(channel == 4) cur_program = "4新闻频道";
        else if(channel == 5) cur_program = "5电影频道";
        System.out.println("正在看" + cur_program);
    }
}
