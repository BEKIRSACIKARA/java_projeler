package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {


    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);

        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        Ardışıkçiftlistelementleriniaynısatırdaaralarındaboşlukbırakarakyazdır(liste);
        System.out.println();
        Ardışıkteklistelemanlarınınkareleriniaynisatırda(liste);
        System.out.println();
        Ardışıkteklistelemanlarınınküplerinitekrarsızolarakaynı(liste);
        System.out.println();
        Tekrarsızçiftelemanlarınkarelerinintoplamı(liste);
        System.out.println();
        Listelemanlarıarasındanenbüyükdeğeribulan(liste);
        System.out.println();
        yedidenbüyükçiftmin(liste);
        System.out.println();
        Terssıralamatekrarsız5tenbüyükelemanlarınyarı(liste);
// (elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
// satırda aralarında boşluk bırakarak yazdır
// aralarında boşluk bırakarak yazdır
    }




    public static void listElemanlariniYazdirFunctional(List<Integer> liste) {
        liste.stream().forEach(Utils::aynisatirdabosluklaYazdir);
    }

    //2)Ardışık çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir
// method oluşturun.(Functional)
    public static void Ardışıkçiftlistelementleriniaynısatırdaaralarındaboşlukbırakarakyazdır(List<Integer> liste) {
        liste.stream().filter(Utils::ciftelemanisec).forEach(Utils::aynisatirdabosluklaYazdir);
    }

    //3) Ardışık tek list elemanlarının karelerini aynı satırda
// aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void Ardışıkteklistelemanlarınınkareleriniaynisatırda(List<Integer> liste) {
        liste.stream().filter(Utils::tekelemanisec).map(Utils::karesinial).forEach(Utils::aynisatirdabosluklaYazdir);

    }

    //4) Ardışık tek list elemanlarının küplerini tekrarsız olarak aynı
// satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void Ardışıkteklistelemanlarınınküplerinitekrarsızolarakaynı(List<Integer> liste) {
        liste.stream().distinct().filter(Utils::tekelemanisec).map(Utils::kupunual).forEach(Utils::aynisatirdabosluklaYazdir);


    }

//5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.
public static void Tekrarsızçiftelemanlarınkarelerinintoplamı(List<Integer> liste) {
    System.out.println(liste.stream().distinct().filter(Utils::ciftelemanisec).map(Utils::karesinial).reduce(Math::addExact));


}
    public static void Listelemanlarıarasındanenbüyükdeğeribulan(List<Integer> liste) {
        Integer max=liste.stream().distinct().reduce(Math::max).get();
        System.out.println(max);

    }
    //8)ödev      List elemanları arasından en küçük değeri bulan bir method oluşturun.(Method Reference)

//9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
public static void yedidenbüyükçiftmin(List<Integer> liste) {
    System.out.println(liste.stream().distinct().filter(t -> t > 7).filter(Utils::ciftelemanisec).reduce(Math::min).get());

}
//10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini
// (elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
public static void Terssıralamatekrarsız5tenbüyükelemanlarınyarı(List<Integer> liste) {
    System.out.println(liste.stream().distinct().filter(t -> t > 5).map(Utils::yarisinial).sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
}

/*stream().//Gerekli methodları kullanmamızı sağlar
                                distinct().//Tekarlı olanları almaz
                                filter(t-> t>5).//Koşula göre filtreleme yapar
                                map(Utils::yarisiniAl).//Her bir elemanın değerini değiştirmeye yarar
                                sorted(Comparator.reverseOrder()).//Sıralama yapar
                                collect(Collectors.toList());//Elamanları collection'a çevirir.

*/










}
