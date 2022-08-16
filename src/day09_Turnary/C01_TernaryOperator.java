package day09_Turnary;

import java.util.Scanner;

public class C01_TernaryOperator {
    //kulanıcıdan bir sayı alın ve mutlak değerinin bulun
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        double sayi=scan.nextDouble();
        System.out.println(sayi>=0?sayi:(-1*sayi));
    }
}
