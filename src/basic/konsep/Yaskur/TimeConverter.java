package basic.konsep.Yaskur;
import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();

        //your code goes here
        int hours = days*24;
        int minute = hours*60;
        int seconds = minute*60;
        System.out.println (seconds);
    }
}
