package basics;
import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;


        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin Yarı Çapını Giriniz: ");
        r = inp.nextInt();
        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        System.out.println("Dairenin Alanı :" + alan);
        System.out.println("Dairenin Çevresi :" + cevre);
    }
}

