package day03_scannes;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println( "ismini giriniz");
        String isim=scan.next();
        System.out.println( "soyismini giriniz");
        String soyisim=scan.next();
        int yas= scan.nextInt();
        System.out.println("Girilen bilgiler :"+isim+" "+soyisim+" "+yas);

}
}

