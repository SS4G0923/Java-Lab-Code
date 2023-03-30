package Lab2;

public class tsk2 {
    public static void main(String[] args) {
        char alpha = 'α', omega = 'ω';
        //System.out.println((int)alpha+" "+(int)omega);  //Find out Unicode number
        int i;
        for(i =(int)alpha; i <= (int)omega; i=i+1){
            System.out.print((char)i+" ");
        }
    }
}
