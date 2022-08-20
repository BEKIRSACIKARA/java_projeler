package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp03java {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);
        büyükharf(liste);
        System.out.println();
       // büyükharf2(liste);
        System.out.println();
        uzunluklarınasıralayazdır(liste);
        System.out.println();
        uzunluklarınagöreterssıralayazdır(liste);
        System.out.println();
        sonkarakterlerinegöresıralayıptekrarsızyazdır(liste);
        System.out.println();
       // Uzunluğu5tenbüyükolanelemanlarısil(liste);
        System.out.println();
        baslangıcıAaNnilebitenelemanlarısil(liste);
        System.out.println();
        System.out.println(uzunluklarının12denazolupolmadığınıkontrol(liste));
        xilebaslimiyormu(liste);
        System.out.println();
        System.out.println("rilebitiyormu(liste) = " + rilebitiyormu(liste));

    }




    //1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.
    //1.yol

    public static void büyükharf(List<String> liste) {
        liste.stream().map(String::toUpperCase).forEach(Utils::aynisatirdabosluklaYazdir);
    }




//2.yol
//public static void büyükharf2(List<String> liste) {
    //   liste.replaceAll(String::toUpperCase);
    //  System.out.println(liste);
//}
    //2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun.
    public static void uzunluklarınasıralayazdır(List<String> liste) {
       liste.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::aynisatirdabosluklaYazdir);
    }

    //3) Elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun.
    public static void uzunluklarınagöreterssıralayazdır(List<String> liste) {
        liste.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::aynisatirdabosluklaYazdir);
    }

//4) Elemanları son karakterlerine göre sıralayıp tekrarsız yazdıran bir method oluşturun.

    public static void sonkarakterlerinegöresıralayıptekrarsızyazdır(List<String> liste) {
        liste.stream().distinct().sorted(Comparator.comparing(Utils::sonkarakter)).forEach(Utils::aynisatirdabosluklaYazdir);
}

    //6.Uzunluğu 5'ten büyük olan elemanları sil

    //public static void Uzunluğu5tenbüyükolanelemanlarısil(List<String> liste) {
    // liste.removeIf(t->t.length()>5);
    //  System.out.println(liste);
    //   }
//7) ‘A’, ‘a’ ile başlayan yada ‘N’, ‘n’ ile biten elemanları silen bir method oluşturun.

    public static void baslangıcıAaNnilebitenelemanlarısil(List<String> liste) {
    liste.removeIf(t -> t.charAt(0) == 'A' || t.charAt(0) == 'a' || t.charAt(t.length() - 1) == 'N' || t.charAt(t.length() - 1) == 'n');
    System.out.println(liste);

}

//9) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol eden bir method oluşturun.
public static boolean uzunluklarının12denazolupolmadığınıkontrol(List<String> liste) {
        return liste.stream().allMatch(t->t.length()<12);//true
}
//10) Hiçbir elemanın 'X' ile başlamadığını kontrol eden bir method oluşturun.
    public static boolean xilebaslimiyormu(List<String> liste) {
        return liste.stream().noneMatch(t->t.startsWith("X")||t.startsWith("X"));

    }
//11) Herhangi bir elemanın 'r' ile bitip bitmediğini kontrol eden bir method oluşturun.
public static boolean rilebitiyormu(List<String> liste) {
        return  liste.stream().anyMatch(t->t.endsWith("r"));
}




}

