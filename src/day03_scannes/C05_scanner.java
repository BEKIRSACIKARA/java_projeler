package day03_scannes;

import java.util.Scanner;

public class C05_scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println( "Lütfen ilk sayıyı girniz");
        double sayi1=scan.nextDouble();
        System.out.println( "Lütfen 2. sayıyı girniz");
        double sayi2=scan.nextDouble();
        System.out.println("sayıların çarpımı : "+(sayi1*sayi2));
    }
}
