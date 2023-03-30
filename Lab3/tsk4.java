package Lab3;

import java.util.Objects;

class People {
    private String name;
    private int age;
    private String gender;
    private double height;
    People(){}
    People(String name, int age, String gender, double height){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }
    void speak(String s){
        System.out.println(this.name + "说：" + s);
    }
    void addCalculate(int x, int y){
        System.out.println(this.name + "计算" + x + "+" + y + "=" + (x+y));
    }
    void changeName(String s){
        System.out.println(this.name + "改名为" + s);
        this.name = s;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    String getGender(){
        return gender;
    }
    double getHeight(){
        return height;
    }
    void setName(String s){
        this.name = s;
    }
    void setAge(int a){
        this.age = a;
    }
    void setGender(String s){
        this.gender = s;
    }
    void setHeight(double h){
        this.height = h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return age == people.age && Double.compare(people.height, height) == 0 && Objects.equals(name, people.name) && Objects.equals(gender, people.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, height);
    }

}

public class tsk4 {
    public static void main(String[] args) {

        People zhangsan = new People("张三", 18, "男", 1.80);
        zhangsan.speak("你好");
        zhangsan.addCalculate(23, 45);
        zhangsan.changeName("李四");
        System.out.println("张三现在叫" + zhangsan.getName());
    }
}

