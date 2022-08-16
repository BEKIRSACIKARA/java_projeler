package day09_Turnary;

import java.util.Scanner;

public class C03_Ternary {
    /*kulanıcıdan bir sayı alın sayı pzitif ise sayi yı yazdırın,
    negatif ise bir sayı daha isteyin ikisinin çarpımını yazdırın
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        double sayi = scan.nextDouble();
        if (sayi > 0) {
            System.out.println(sayi);
        } else {
            System.out.println("lütfen bir sayı daha giriniz");
            double sayi2 = scan.nextDouble();
            System.out.println(sayi * sayi2);
        }
    }
}
/*
eğer if yada else için de yeni kodlar varsa ternary ile yapamayız
 */