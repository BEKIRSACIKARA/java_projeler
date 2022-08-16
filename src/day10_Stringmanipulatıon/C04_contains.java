package day10_Stringmanipulatıon;

import java.util.Scanner;

public class C04_contains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cümle = scan.nextLine();
        if (cümle.contains("buyuk") == true) {
            System.out.println(cümle.toUpperCase());
        } else if (cümle.contains("kucuk") == true){System.out.println(cümle.toLowerCase());;
    }
        else System.out.println("cumle buyuk yada kucuk kelimesi içermiyor");
}
}



