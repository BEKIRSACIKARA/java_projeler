package day03_scannes;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("karenin bir kenarının uzunluğunu giriniz");
        double sayi=scan.nextDouble();
        System.out.println("çevre :"+(4*sayi)+" /karenin alanı :"+(sayi*sayi));



    }
}
