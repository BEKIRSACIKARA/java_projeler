package day03_scannes;

public class C02_Swap {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 0;
        sayi3 = sayi2;
        sayi2 = sayi1;
        sayi1 = sayi3;
        System.out.println("swaptan sonra sayi 1: " + sayi1);
        System.out.println("swaptan sonra sayi 2: " + sayi2);

    }
}
