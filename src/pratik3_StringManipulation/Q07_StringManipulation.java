package pratik3_StringManipulation;

import java.util.Scanner;

public class Q07_StringManipulation {
    /* String str1="$13.99"
    String str2="$10.55"  topla
     */
    public static void main(String[] args) {
        String str1="$13.99";
        String str2="$10.55";
        String sayi1=str1.substring(1);
        String sayi2=str2.substring(1);

        System.out.println("$"+(Double.parseDouble(sayi1)+Double.parseDouble(sayi2)));



    }




}
