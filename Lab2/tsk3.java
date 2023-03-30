package Lab2;

import java.util.Scanner;
public class tsk3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        while (true) {
            int x = sc.nextInt();
            boolean res = Algorithm.searchAlgorithm.binarySearch(array, x);
            if (res)
                System.out.println("找到");
            else
                System.out.println("没有");
        }
    }
}
//    static boolean binarySearch(int[] array,int x){
//
//        int l = 0, r = array.length - 1, mid = (l+r) / 2;
//        for(int i = 0; i< array.length; i++){
//            if(x>array[mid]) {
//                l = mid + 1;
//                mid = (l + r) / 2;
//            }
//            else if (x<array[mid]){
//                r = mid - 1;
//                mid = (l+r) / 2;
//            }
//            else if (x == array[mid])
//                return true;
//        }
//        return false;
//        }
//    }

