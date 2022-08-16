package day11_Stringmanipulation;

import com.sun.jdi.CharValue;

import java.util.Scanner;

public class C03_StringManipulatıonsifre {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 8 karakterli , ilk harfi büyük son harfi küçük, bosluk içermeyen bir şifre giriniz..");
        String kelime = scan.nextLine();
        //if (kelime.length() != 8&&kelime.contains("")&&(kelime.charAt(0)<'A'||kelime.charAt(0)>'Z')&&(kelime.charAt(7)<'a'||kelime.charAt(7)>'z'))

        if (kelime.charAt(0) < 'A' || kelime.charAt(0) > 'Z') {
            System.out.println("İşlem başarısız lütfen ilk karakteri büyük harf yazınız");}

        else if (kelime.charAt(7) < 'a' || kelime.charAt(7) > 'z') {
            System.out.println("İşlem başarısız lütfen son karakteri küçük harf yazınız");}

        else if (kelime.length()!=8 ){
        System.out.println("İşlem başarısız 8 karakterli yeni bir şifre giriniz.");}

        else if (kelime.contains("")==true){
            System.out.println("İşlem başarısız bosluk içermeyen yeni bir şifre giriniz.");}
        else
                System.out.println("şifre başarıyla tamamlandı");

}
}


//else System.out.println(kelime.replace((kelime.charAt(3)),(kelime.charAt(0)))kelime.replace((kelime.charAt(2)),(kelime.charAt(1))),
//        kelime.replace((kelime.charAt(1)),(kelime.charAt(2))),
//      kelime.replace((kelime.charAt(0)),(kelime.charAt(3))));

// else System.out.println(String.valueOf((kelime.charAt(3)+kelime.charAt(2))));





