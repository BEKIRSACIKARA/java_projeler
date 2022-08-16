package day08_IfStatements;

import java.util.Scanner;

public class C02_IfStatementsyasemekli {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        emeklilik kontorlü yapan bir pro
        erkek kadın değişkeni olacak farklı bir şey girilire hata versi z yaş sınırı
        kadınlarda 60   erkek lerde 65 olacak
        negatif olursa hata versin
         */

        System.out.println("Lütfen cinsiyetinizi yazınız" + " kadın için K, erkek için E harfi giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("Lütfen yaşınızı giriniz");
        double yas = scan.nextDouble();
        if (cinsiyet == 'E') {
            if (yas < 0 || yas > 80) {
                System.out.println("Lütfen geçerli bir yaş giriniz");
            } else if (yas < 65) {
                System.out.println("Emekli olamasın "+(65-yas)+" yıl daha var. Çalış koçum çalış....");
            } else {
                System.out.println("Emekli olabilirsin.keyfine bak");
            }
        } else if (cinsiyet == 'K') {
            if (yas < 0 || yas > 80) {
                System.out.println("Lütfen geçerli bir yaş giriniz");
            } else if (yas < 60) {
                System.out.println("Emekli olamasın boşuna uğraşma kocanla iyi geçin o sana bakar...");
            } else {
                System.out.println("Emekli olabilirsin.keyfine bak");
            }
        } else {
            System.out.println("Lütfen geçerli bir değer giriniz");
        }
    }
}