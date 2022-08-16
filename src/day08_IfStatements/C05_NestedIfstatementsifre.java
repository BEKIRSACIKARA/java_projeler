package day08_IfStatements;

import java.util.Scanner;

public class C05_NestedIfstatementsifre {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen şifre giriniz");
        String sifre = scan.nextLine();
        char ilkharf = sifre.charAt(0);
        if (ilkharf >= 'A' && ilkharf <= 'Z') {
            if (ilkharf == 'A') {
                System.out.println("geçerli şifre");
            } else {
                System.out.println("geçersiz şifre");
            }


        } else if (ilkharf >= 'a' && ilkharf <= 'z') {
            if (ilkharf == 'z') {
                System.out.println("geçerli şifre");
            } else {
                System.out.println("geçersiz şifre");


            }
        } else {
            System.out.println("lütfen ilk karakter için sadece harf kulanın");
        }
    }
}
