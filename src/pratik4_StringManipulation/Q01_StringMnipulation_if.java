package pratik4_StringManipulation;

import java.util.Scanner;

public class Q01_StringMnipulation_if {
    public static void main(String[] args) {
        /*
        kullanıcıdan işlem ve iki sayı isteyin o yapsın

         */
        Scanner scan=new Scanner(System.in);
       // System.out.println("lüften +-*/ işlem karakterlerinden" +
        //        " birini sonra biribci " +
        //        "sayıyı sonrada ikinci sayıyı giriniz.");

        int dongu=0;
        double sonuc = 0;
        String dur="d";
        for (int i = dongu; i <4; i++) {System.out.println("lütfen "+(i+1)+". sayıyı giriniz");
            double sayi=scan.nextDouble();
            System.out.println("lüften +-*/ işlem karakterlerinden birini giriniz");
            char islem=scan.next().charAt(0);
            if (islem =='+'||islem =='-'||islem =='*'||islem =='/') {
                if (islem == '+') {sonuc+=sayi;}
                    else if (islem == '-') {sonuc-=sayi;}
                    else if (islem == '*') {sonuc*=sayi;}
                    else if (islem == '/') {sonuc/=sayi;}
                dongu ++;}
            else System.out.println("lüften +-*/ işlem karakterlerinden birini giriniz");

            System.out.println(sonuc);
                }
    }
}







           /* if (islem == '+') {
            sonuc +=sayi1 + sayi2;
                }
                else if (islem == '-') {
                sonuc +=sayi1 - sayi2;

                }else if (islem == '*') {
                sonuc +=sayi1 * sayi2;
                }
                else if (islem == '/') {
                sonuc +=sayi1 / sayi2;}
*/