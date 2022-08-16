package day07_ifSatatement;

import java.util.Locale;
import java.util.Scanner;

public class C03_basitIfStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen geçerli bir gün ismi giriniz");
        String girilenGun = scan.next().toLowerCase();
        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi")) {
            System.out.println("HAFTASONU");
        }
        if (girilenGun.equals("pazartesi") || girilenGun.equals("salı") || girilenGun.equals("carsamba")
                | girilenGun.equals("persembe") || girilenGun.equals("cuma")) {
            System.out.println("HAFTAİÇİ");
        }
        if (!(girilenGun.equals("pazartesi") || girilenGun.equals("salı") || girilenGun.equals("carsamba")
                | girilenGun.equals("persembe") || girilenGun.equals("cuma")
                || girilenGun.equals("cumartesi") || girilenGun.equals("pazar"))) {
            System.out.println("Lütfen geçerli bir gün giriniz");


        }
    }
}