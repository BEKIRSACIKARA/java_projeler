package day04_dataCasting;

public class C03_DataCasting {
    public static void main(String[] args) {
        byte sayi1= (byte) 128;
        short sayi2=sayi1;
        System.out.println(sayi2);

        int sayi3=5000;
        byte sayi4= (byte) sayi3;
        System.out.println(sayi4);
float sayi5=3256f;
double sayi6=225.36;
int sayi7= (int) sayi6;
        System.out.println(sayi7);
        byte sayi8= (byte) sayi7;
        System.out.println(sayi8);
        double sayi9= sayi3/sayi6;
        System.out.println(sayi9);


    }
}
