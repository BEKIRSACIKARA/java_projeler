package day07_ifSatatement;

import java.util.Scanner;

public class C06_IfElseStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas = scan.nextInt();
        if (yas < 65) {
            System.out.println("Emekli olamazsın daha " + (65 - yas) + " sene çalışman gerekiyor.");
        } else {
            System.out.println("Emekli olabilirsin");


        }
    }
}
