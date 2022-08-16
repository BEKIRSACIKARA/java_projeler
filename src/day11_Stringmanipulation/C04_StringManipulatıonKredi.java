package day11_Stringmanipulation;

import java.util.Scanner;

public class C04_StringManipulatıonKredi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adınızı soy adınızı ve kredi kartı bildilerinizi sırasıyla giriniz");
        String isim = scan.next();
        String soyisim = scan.next();
        String kart = scan.next();
        String isimyeni = isim.substring(0,1).toUpperCase()
                + isim.substring(1).replaceAll("\\w", "*");
        String soyisimyeni = soyisim.substring(0,1).toUpperCase()
                + soyisim.substring(1).replaceAll("\\w", "*");
        String yenikart = kart.substring(0, 14).replaceAll("\\d", "*") + kart.substring(14);
        System.out.println(isimyeni + " " + soyisimyeni);
        //System.out.println(yenikart);


    }
}


//else System.out.println(kelime.replace((kelime.charAt(3)),(kelime.charAt(0)))kelime.replace((kelime.charAt(2)),(kelime.charAt(1))),
//        kelime.replace((kelime.charAt(1)),(kelime.charAt(2))),
//      kelime.replace((kelime.charAt(0)),(kelime.charAt(3))));

// else System.out.println(String.valueOf((kelime.charAt(3)+kelime.charAt(2))));





