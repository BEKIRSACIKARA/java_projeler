package day10_Stringmanipulatıon;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir gmail olan bir mail adresi giriniz");
        String mail = scan.next().toLowerCase();
        if (mail.contains("@gmail.com") == true) {
            System.out.println("Email adresi niz kaydedildi");
        } else System.out.println("lütfenyazımı kontrol edin");
    }
}



