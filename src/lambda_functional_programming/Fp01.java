package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {
    /*
    1) Lambda (Functional Programming) Java 8 ile kullanılmaya başlanmıştır.
    2) Functional Programming'de "Ne yapılacak" (What to do) üzerine yoğunlaşılır.
       Structured Programming "Nasıl yapılacak" (How to do) üzerine yoğınlaşılır.
    3) Functional Programming, Arrays ve Collections ile kullanılır.
    4) "entrySet() methodu ile Map, Set'e dönüştürülerek Functional Programming'de kullanılabilir.

     */

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

        listElemanlariniYazdirStructured(liste);
        System.out.println();
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftelemanlariYazdıirStructured(liste);
        System.out.println();
        ciftelemanlariYazdıirFunctional(liste);
        System.out.println();
        tekelemanlarikareleriYazdıirFunctional(liste);
        System.out.println();
        ciftelemanlaritekrarsizkupleriniYazdıirFunctional(liste);
        System.out.println();
        tekrarsizciftelemanlarikarelerinintoplamiYazdirFunctional(liste);
        System.out.println();
        tekrarsizciftelemanlarininkupununcarpiminiYazdirFunctional(liste);
        System.out.println();
        getmaxElemen(liste);
        System.out.println();
        getminElemen(liste);
        System.out.println();
        getmaxElemen02(liste);
        System.out.println();
        getYedidenBuyukciftmin(liste);
        System.out.println();
        getYedidenBuyukciftmin3(liste);
        System.out.println();
        getTerssiralamailetekrarsizve5tenbüyükelemanlarınyarıdeğerleri(liste);



    }
    //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
    public static void listElemanlariniYazdirStructured(List<Integer> list){

        for(Integer w : list){

            System.out.print(w+" ");

        }
    }

    //1)Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void listElemanlariniYazdirFunctional(List<Integer> list){
        list.stream().forEach(t-> System.out.print(t+" "));




    }
//2)Ardışık çift list elemanlrini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)

public static void ciftelemanlariYazdıirStructured(List<Integer> list){

    for (Integer w:list) {
        if (w%2==0){
            System.out.print(w+" ");
    }

}





}
//2)Ardışık çift list elemanlrini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)

    public static void ciftelemanlariYazdıirFunctional(List<Integer> list){
        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));



    }
//3) Ardışık tek list elementlerinin karelerini aynı satırda aralarında boşluk bırakarak
//yazdıran bir method oluşturun.(Functional)

    public static void tekelemanlarikareleriYazdıirFunctional(List<Integer> list){
        list.stream().filter(t->t%2!=0).map(t->t*t).distinct().forEach(t-> System.out.print(t+" "));





}
    public static void ciftelemanlaritekrarsizkupleriniYazdıirFunctional(List<Integer> list){
        list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));




    }
    public static void tekrarsizciftelemanlarikarelerinintoplamiYazdirFunctional(List<Integer> list){
        System.out.println(list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u));


    }
    public static void tekrarsizciftelemanlarininkupununcarpiminiYazdirFunctional(List<Integer> list){
        System.out.println(list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t*t).reduce(1, (t, u) -> t * u));


    }
    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    public static void getmaxElemen(List<Integer> list){
        System.out.println(list.stream().distinct().reduce(Integer.MIN_VALUE,(t, u) -> t>u?t:u));
}

    public static void getminElemen(List<Integer> list){
        System.out.println(list.stream().distinct().reduce(Integer.MAX_VALUE,(t, u) -> t<u?t:u));


}
//2.yol
public static void getmaxElemen02(List<Integer> list){
    System.out.println(list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t, u) ->u));
}

    public static void getYedidenBuyukciftmin(List<Integer> list){
        System.out.println(list.stream().distinct().filter(t -> t % 2 == 0).filter(t->t>7).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t, u) ->u));
//sorted(Comparator.reverseOrder()) tersten sıralama
}

    public static void getYedidenBuyukciftmin3(List<Integer> list){
        Integer min =list.stream().filter(t -> t % 2 == 0).filter(t->t>7).sorted().findFirst().get();
        System.out.println(min);


    }
    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
    public static void getTerssiralamailetekrarsizve5tenbüyükelemanlarınyarıdeğerleri(List<Integer> list){
       List<Double> sonuc =list.stream().distinct().filter(t -> t > 5).map(t -> t / 2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sonuc);//[65.5, 5.0, 4.5, 4.0]
       //sorted(Comparator.reverseOrder()) ters sıralama
//collect(Collectors.toList())   list yapmak için
    }
    /*echo "# Java_projeler" >> README.md
git init
git add README.md
git commit -m "ilk taahhüt"
git branch -M main
git remote add Origin https://github.com/BEKIRSACIKARA/java_projeler.git
 git push - asıl sen
 error: remote origin already exists.
error: failed to push some refs to

 */










}

