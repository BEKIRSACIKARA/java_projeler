package day05_matematikselislemler;

public class C01_Pre_post_Increment {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = sayi1 + 1;
        int sayi3 = sayi2++;
        int sayi4 = ++sayi1;
        System.out.println(sayi2);//12
        System.out.println(sayi3);//11
        System.out.println(sayi4);//11


    }


}
