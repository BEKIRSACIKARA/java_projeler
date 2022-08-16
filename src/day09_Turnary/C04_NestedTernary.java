package day09_Turnary;

import java.util.Scanner;

public class C04_NestedTernary {
    /*kulanıcıdan bir sayı alın sayı pzitif ise sayi yı yazdırın,
    negatif ise bir sayı daha isteyin ikisinin çarpımını yazdırın
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen bir harf giriniz");
        char harf = scan.next().charAt(0);

        String sonuc=(harf>='a'&&harf<='z')?("küçük harf"):((harf>='A'&&harf<='Z')?"büyük harf":"geçersiz karakter");
        System.out.println(sonuc);
                   }
    }

/*
eğer if yada else için de yeni kodlar varsa ternary ile yapamayız
 */