package Lab2;

public class tsk6 {
    public static void main(String[] args) {
        long res = 0;
        for(int i = 1; i<=10; i++){
            res += factorial(i);
        }
        //System.out.println(factorial(5));  //This line of code is just for testing.
        System.out.println(res);
    }

   static int factorial(int n){
        if(n == 1 || n == 0)
            return 1;
        return n*factorial(n-1);
    }
}
