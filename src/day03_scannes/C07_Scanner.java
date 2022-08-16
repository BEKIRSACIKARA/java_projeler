package day03_scannes;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen  iki tam sayı giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        System.out.println("sayıların toplamı :"+(sayi1+sayi2)+" /sayıların farkı :"+(sayi1-sayi2)+" /sayıların çarpımı :"+sayi1*sayi2);




    }
}
