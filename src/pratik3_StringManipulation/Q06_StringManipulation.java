package pratik3_StringManipulation;

import java.util.Scanner;

public class Q06_StringManipulation {
    /* scaner kullanaak iki ayrı deger giriniz.bu iki degei birleştiriniz
    string manupulatin kullanarak birleştiriniz.ilk ve
     ikinci degerlerin ilk harfalerini birleştirip atıp birleştir.

     */

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("string1");
        String str1=scan.nextLine();
        System.out.println("string2");
        String str2=scan.nextLine();
        System.out.println(str1.concat(" "+str2));
        System.out.println(str1.substring(1).concat(" "+str2.substring(1)));
    }



}
