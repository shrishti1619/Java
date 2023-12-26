package if_else;

import java.util.Scanner;

public class IfElseUseCase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int rem = n%2;
        if(rem==0){
            System.out.println("Even");
            return;
        } System.out.println("Odd");
    }
}
