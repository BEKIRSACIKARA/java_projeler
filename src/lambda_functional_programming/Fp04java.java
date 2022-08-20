package lambda_functional_programming;

import java.util.Comparator;
import java.util.stream.IntStream;

public class Fp04java {
    public static void main(String[] args) {
        System.out.println("7 den 100 toplam = " + yediden100ekadarintegerdegtop());
        System.out.println("2 den 11 e çarpım = " + ikien11carpımintegerdegtcarpim());
        System.out.println("faktoriyelhesapla = " + faktoriyelhesapla(12));
        System.out.println("ikisayıarasındakiçiftsayılarıntop = " + ikisayıarasındakiçiftsayılarıntopl(11, 2));
        System.out.println("verilerilenikisayiarasındakisayılarınrakmlarıtop(10,26) = " + verilerilenikisayiarasındakisayılarınrakmlarıtop(10, 26));


    }




    //1) 7'den 100'e kadar integer değerlerinin toplamını bulan bir method oluşturun.
public static int yediden100ekadarintegerdegtop() {
    return IntStream.range(7,101).reduce(Math::addExact).getAsInt();
}
//2) 2'den 11'e kadar integer değerlerinin çarpımını bulan bir method oluşturun.

    public static int ikien11carpımintegerdegtcarpim() {
        return IntStream.rangeClosed(2,11).reduce(Math::multiplyExact).getAsInt();
    }
//3) Verilen bir sayının faktoriyelini hesaplayan bir method oluşturun. (5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)
public static int faktoriyelhesapla(int x) {
        if (x>0){
    return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();
}
    System.out.println("odan büyük ve 15 den küçük değer giriniz");
return 0;
}
//4) Verilen iki sayı arasındaki çift sayıların toplamını bulan bir method oluşturun.
public static int ikisayıarasındakiçiftsayılarıntopl(int x,int y) {
        if(x<y)
    return IntStream.rangeClosed(x,y).filter(Utils::ciftelemanisec).reduce(Math::addExact).getAsInt();
else
    return IntStream.rangeClosed(y,x).filter(Utils::ciftelemanisec).reduce(Math::addExact).getAsInt();
}

    public static int verilerilenikisayiarasındakisayılarınrakmlarıtop(int x,int y) {

        return  IntStream.rangeClosed(x,y).map(Utils::rakamlarToplaminiAl).sum();

    }




}
