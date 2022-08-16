package day07_ifSatatement;

public class C02_Ifstatements {
    public static void main(String[] args) {//kölibase
        int sayi = 10;
        if (sayi > 0) {
            System.out.println("sayıpozitif");
        }
        if (sayi % 2 == 0) {
            System.out.println("sayı çift");
        }
        if (sayi%5==0){
            System.out.println("sayi 5'in tam katı");
        }
    }
}