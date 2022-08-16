package day03_scannes;

import java.util.Scanner;

public class C09_Sacanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi giriniz");
        char isim=scan.next().toUpperCase().charAt(0);
        System.out.println(isim);
    }
}
