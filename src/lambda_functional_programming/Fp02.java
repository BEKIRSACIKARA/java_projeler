package lambda_functional_programming;

import java.util.ArrayList;
import java.util.List;

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


}
