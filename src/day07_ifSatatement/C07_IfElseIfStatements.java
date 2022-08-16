package day07_ifSatatement;

import java.util.Scanner;

public class C07_IfElseIfStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas = scan.nextInt();
        if (yas < 0) {
            System.out.println("Lütfen geçerli bir yas yazınız");
        } else if (yas < 65) {
            System.out.println("Emekli olamazsın daha " + (65 - yas) + " yıl çalıman gerekiyor.");
        } else {
            System.out.println("Emekli olabilirsin");
        }
    }


}
