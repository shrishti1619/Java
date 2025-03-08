import java.util.Scanner;

public class Functions {
    public static int factorial(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            num = num * i;
        }
        return num;
    }
    public static boolean prime(int n){
        int d = 2;
        while(d < n){
            if(n % d ==0) {
                return false;
            }
            d++;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
//        int r = scan.nextInt();
//
//        //numerator
//        int num = factorial(n);
//
//        int den1 = factorial(r);
//
//        int den2 = factorial(n-r);
//
//        int ans = num / (den1 * den2);
//        System.out.println("Combination result: " + ans);
        System.out.println(prime(n));
    }
}
