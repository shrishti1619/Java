import java.util.Scanner;

public class FahToCelTemperature {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int f = scan.nextInt();
//        int cel = (5/9)*(f-32); incorrect

        int cel = (5 * (f-32)/ 9);
        int cel2 = (int)((5.0/9) * (f-32));

        System.out.println(cel);
        System.out.println(cel2);
        System.out.println('a' + 'b');
    }
}
