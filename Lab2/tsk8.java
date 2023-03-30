package Lab2;

public class tsk8 {
    public static void main(String[] args) {
        System.out.println(function(10));
    }
    static long function(int n){
        long sum = 0;
        for(int i = 1; i<= n; i++){
            sum += num_Generator8(i);
        }
        return sum;
    }
    static long num_Generator8(int dig){
        long res = 0;
        for(int i = dig-1; i>=0; i--){
            res += 8*Math.pow(10,i);
        }
        return res;
    }
}
