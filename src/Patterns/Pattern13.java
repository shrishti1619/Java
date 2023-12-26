package Patterns;

import java.util.Scanner;
/*
ABCD
BCDE
CDEF
DEFG
*/
public class Pattern13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        int k = 0;
        while(i<=n){
            int j = 0;
            while(j<n) {
                System.out.print((char)('A'+ k + j));
                j++;
            }
            System.out.println();
            k++;
            i++;
        }
    }

}
