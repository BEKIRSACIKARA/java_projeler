package day08_IfStatements;

import java.util.Scanner;

public class C01_Ifstatements {
    /*kullanıcıdan 100 üzerinden not isteyin bunları harfe cevirin
    50 den kucukse 0,
    50-60 arası ise c
    60-80 ise b
    80 üzeri ise a
    gecersiz not verildiğinde uyarı
    olacak
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 0'dan büyük ve 100'den küçük bir not değeri giriniz");
        double not = scan.nextDouble();
        if (not < 0 || not > 100) {
            System.out.println("Lütfen geçerli bir değer giriniz");
        } else if (not < 50) {
            System.out.println("Notunuz: D");
        } else if (not >= 50 && not < 60) {
            System.out.println("Notunuz: C");
        } else if (not >= 60 && not < 80) {
            System.out.println("Notunuz: B");
        } else if (not >= 80) {
            System.out.println("Notunuz: A");

        }

    }
}
