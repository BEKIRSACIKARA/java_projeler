package day11_Stringmanipulation;

import java.util.Scanner;

public class C02_StringManipulatıon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 4 harfli bir kelime giriniz");
        String kelime = scan.next();
        String harf1 = String.valueOf(kelime.charAt(0));
        String harf2 = String.valueOf(kelime.charAt(1));
        String harf3 = String.valueOf(kelime.charAt(2));
        String harf4 = String.valueOf(kelime.charAt(3));
        if (kelime.length() != 4) {
            System.out.println("lütfen 4 harfli bir kelime giriniz");}
            else System.out.println(harf4 + harf3 + harf2 + harf1);
        }
    }
//else System.out.println(kelime.replace((kelime.charAt(3)),(kelime.charAt(0)))kelime.replace((kelime.charAt(2)),(kelime.charAt(1))),
//        kelime.replace((kelime.charAt(1)),(kelime.charAt(2))),
//      kelime.replace((kelime.charAt(0)),(kelime.charAt(3))));

// else System.out.println(String.valueOf((kelime.charAt(3)+kelime.charAt(2))));





