package Patterns;

import java.util.Scanner;

public class Patterns4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i =1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print("*");
                j+=1;
            }
            System.out.println();
            i+=1;
        }
    }
}
