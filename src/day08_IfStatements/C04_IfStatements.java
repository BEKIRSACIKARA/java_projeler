package day08_IfStatements;

import java.util.Scanner;

public class C04_IfStatements {



    /*
    sayının 5 e bölünebilmesi ve tek mi çift mi olduğuyla alakalı
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 4 basamaklı bir sayı giriniz");
        int sayi = scan.nextInt();

        if (sayi < 1000 || sayi > 9999) {
            System.out.println("4 basamaklı bir sayı gir");
        } else if (sayi % 5 == 0) {
            if (sayi % 10 == 0) {
                System.out.println("5'e bölünebilen çift sayı");
            } else System.out.println("5'e bölünebilen tek sayı");

        } else {
            System.out.println("lütfen tekrar deneyin bu sayı 5' bölünemiyor");
        }
    }
}

