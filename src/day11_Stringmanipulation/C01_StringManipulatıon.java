package day11_Stringmanipulation;

import java.util.Scanner;

public class C01_StringManipulatıon {
    public static void main(String[] args) {
        String str1 = "$13.99";
        String str2 = "$10.55";
        double yeni1 = Double.parseDouble(str1.substring(1, 6));
        double yeni2 = Double.parseDouble(str2.substring(1, 6));
        System.out.println("$" + (yeni1 + yeni2));
        /////////////////////////////////////////////////////
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir isim giriniz");
        String isim = scan.nextLine();
        if (isim.contains("a") == true) {
            System.out.println("isim a harfi içeriyor");
        } else if (isim.contains("Z") == true) {
            System.out.println("isim Z harfi içeriyor");
            ;
        } else System.out.println("isim a ve Z harfi içermiyor");
//////////////////////////////////////////////////////////////
        Scanner scan1 = new Scanner(System.in);
        System.out.println("isim giriniz");
        String isim1 = scan1.nextLine();
        System.out.println("soyisim giriniz");
        String isim2 = scan1.nextLine();
        if (isim1.length() > isim2.length()) {
            System.out.println("isim soyisimden daha uzun");
        } else if (isim1.length() < isim2.length()) {
            System.out.println("soyisim isimden daha uzun");
        } else System.out.println("sim ve soy isim birbirine eşittir.");


    }

}




