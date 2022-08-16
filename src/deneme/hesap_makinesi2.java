package deneme;

import java.util.Objects;
import java.util.Scanner;

public class hesap_makinesi2 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sonuc=0;
        int dongu=1;
        //System.out.println("Lütfen bir sayı giriniz.");
        //double sayi1 = scan.nextDouble();

        for (int i = dongu; i<5; i++) {
            System.out.println("Lütfen bir sayı giriniz.");
            double sayi = scan.nextDouble();
            System.out.println("Lütfen bir işlem giriniz.");
            char islem = scan.next().charAt(0);

            if (islem =='+'||islem =='-'||islem =='*'||islem =='/') {
                if (islem == '+') {sonuc+=sayi;}
                else if (islem == '-') {sonuc-=sayi;}
                else if (islem == '*') {
                   if (i == 1) {
                       sonuc+=sayi;}
                       else {sonuc*=sayi;}
                   }
                else if (islem == '/') {
                    if (i == 1) {
                        sonuc+=sayi;}
                    else {sonuc/=sayi;}}
                else System.out.println("lütfen + - * / den birini girin.");
                dongu ++;}
            else if (islem =='=') {
                System.out.println(sonuc);
                break;

            }




        }

    }
}