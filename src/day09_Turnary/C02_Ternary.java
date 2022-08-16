package day09_Turnary;

import java.util.Scanner;

public class C02_Ternary {
    //kulanıcıdan bir sayı alın sayı pzitif ise pozif sayınegatif ise karesini alın
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        double sayi=scan.nextDouble();
        System.out.println(sayi>0?"sayi pozitif":(sayi*sayi));

    }
}
