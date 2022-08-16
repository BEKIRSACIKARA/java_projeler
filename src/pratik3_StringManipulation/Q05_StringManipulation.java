package pratik3_StringManipulation;

import java.util.Scanner;

public class Q05_StringManipulation {
    /* kulanıcıdan ismini ve dayısını girmesini isteyin sonra sında konsola buyuk harf olarak yazdırın

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen isminizi ve soy isminizi giriniz");
        String firstname = scan.nextLine(), lastname = scan.nextLine();
        String fullname = (firstname+" " + lastname).toUpperCase();
        System.out.println(fullname);
    }
}
