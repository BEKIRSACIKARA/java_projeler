package day07_ifSatatement;

public class C01_AndOparatörleri {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 20;
        System.out.println(a > 0 && b < 20 && c > b);//mükemmelliyetçi hızlı   true
        System.out.println(a < 0 & b < 20 & c > b); //yavaş false

    }
}
