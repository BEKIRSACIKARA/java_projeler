package day03_scannes;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String kulaniciismi = scan.next();
        System.out.println("bekirin en sevidiği isimdir " + kulaniciismi+"  çünkü hayatının anlamı onu taşıyan kişi");
    }
}
