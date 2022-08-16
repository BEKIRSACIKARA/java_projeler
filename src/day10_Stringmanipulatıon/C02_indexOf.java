package day10_Stringmanipulatıon;

public class C02_indexOf {
    public static void main(String[] args) {
    String str="java öğrenmek ne kolay";
        System.out.println(str.indexOf("ğ"));// 0 dan başlanır boşlukarda sayılır
        System.out.println(str.indexOf("t"));// 0 dan başlanır boşlukarda sayılır  olmayan değer -1 olur


        String str5="fhsvjasvjasvkjas  ssasfv ,sss.LKSN.LhsdhSLKVD";
        if (str5.indexOf("s")==-1){
        System.out.println("kullanılmamış");}
else{
                System.out.println("istenen karakter kullanılmış");}

    }
}



