package Lab2;

public class tsk7 {
    public static void main(String[] args) {
        int n = 20;
        double res1 = do_While_Version(n);
        double res2 = for_Version(n);
        System.out.println(res1+"\n"+res2);
    }

    static double do_While_Version(int n){
        double res = 0.0f;
        do {
            res += 1.0f/ factorial(n);
            n -= 1;
        } while(n>=1);
        return res;
    }
    static double for_Version(int n){
        double res = 0.0f;
        for (int i = n; i>=1; i--){
            res += 1.0f/factorial(i);
        }
        return res;
    }
    static int factorial(int n){
        if(n == 1 || n == 0)
            return 1;
        return n*factorial(n-1);
    }
}
