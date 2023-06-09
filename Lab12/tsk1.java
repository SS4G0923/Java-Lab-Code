package Lab12;

import java.io.*;

public class tsk1 {
    public static void main(String[] args) {
        File file = new File("People.txt");
        String[] content = {"天气预报：", "北京晴", "上海多云，有小雨", "大连晴，有时多云"};
        try{
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (String s : content) {
                bw.write(s);
                bw.newLine();
            }
            bw.close();
            fw.close();

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
            fr.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
