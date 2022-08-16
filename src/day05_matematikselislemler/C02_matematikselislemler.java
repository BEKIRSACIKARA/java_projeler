package day05_matematikselislemler;

import java.util.Scanner;

public class C02_matematikselislemler {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 4 basamklı bir sayı giriniz");
        int sayi=scan.nextInt();//5267
        int birlerbasamagi=0;
        int rakamlaryoplami=0;
        int ilkgirilensayi=sayi;
        birlerbasamagi=sayi%10;//7
        rakamlaryoplami +=birlerbasamagi;//7
        sayi /=10;//526
        birlerbasamagi =sayi%10;//6
        rakamlaryoplami +=birlerbasamagi;//7+6
        sayi/=10;//52
        birlerbasamagi =sayi%10;//2
        rakamlaryoplami +=birlerbasamagi;//7+6+2
        sayi/=10;
        birlerbasamagi =sayi%10;
        rakamlaryoplami +=birlerbasamagi;//7+6+2+5
        sayi/=10;
        birlerbasamagi =sayi%10;
        rakamlaryoplami +=birlerbasamagi;//7+6+2+5+0
        System.out.println(ilkgirilensayi+" sayısının rakamları toplamı :"+rakamlaryoplami+" eder.");







    }
}
