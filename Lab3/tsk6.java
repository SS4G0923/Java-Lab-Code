package Lab3;

class CPU{
    int speed;

    int getSpeed(){
        return speed;
    }

    void setSpeed(int s){
        this.speed = s;
    }
}

class HardDisk{
    int amount;

    int getAmount(){
        return amount;
    }

    void setAmount(int amount){
        this.amount = amount;
    }
}

class PC{
    CPU cpu;
    HardDisk hd;

    void setCPU(CPU c){
        this.cpu = c;
    }

    void setHardDisk(HardDisk hd){
        this.hd = hd;
    }

    void show(){
        System.out.println("CPU速度：" + cpu.getSpeed() + "，HD的容量：" + hd.getAmount());
    }
}

public class tsk6 {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        cpu.setSpeed(2200);
        HardDisk disk = new HardDisk();
        disk.setAmount(200);
        PC pc = new PC();
        pc.setCPU(cpu);
        pc.setHardDisk(disk);
        pc.show();
    }
}
