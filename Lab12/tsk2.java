package Lab12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class tsk2 {
    public static void main(String[] args) {
        try{
            File file = new File("cost.txt");
            Scanner sc = new Scanner(file);
            String regex = "[^0123456789]+";
            sc.useDelimiter(regex);
            int sum = 0;
            while(sc.hasNextInt()){
                sum += sc.nextInt();
            }
            System.out.println("总消费：$" + sum);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
