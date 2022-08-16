package deneme;

import java.util.Objects;
import java.util.Scanner;

public class hesap_makinesi {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double ilkdeger = 0;
        int dongu = 0;
        System.out.println("Lütfen 1. sayı giriniz.");
        double sayi = scan.nextDouble();
        double toplam = sayi + ilkdeger;

        for (int i = dongu; i < 20; i++) {
            System.out.println("Lütfen bir işlem giriniz.");
            Scanner scan1 = new Scanner(System.in);
            String islem = String.valueOf(scan1.next().charAt(0));
            System.out.println("Lütfen " + (dongu + 2) + ". sayı giriniz.");
            Scanner scan3 = new Scanner(System.in);
            double sayi2 = scan3.nextDouble();
            if (Objects.equals(islem, "+") || Objects.equals(islem, "-") ||
                    Objects.equals(islem, "*") || Objects.equals(islem, "/")) {
                if (Objects.equals(islem, "+")) {
                    toplam += sayi2;
                } else if (Objects.equals(islem, "-")) {
                    toplam -= sayi2;
                } else if (Objects.equals(islem, "*")) {
                    toplam *= sayi2;
                } else if (Objects.equals(islem, "/")) {
                    toplam /= sayi2;
                } else if (Objects.equals(islem, "=")) {
                    System.out.println(toplam);
                    //else System.out.println("lütfen + - * / den birini girin.");
                    dongu++;
                }


            }

        }

    }
}