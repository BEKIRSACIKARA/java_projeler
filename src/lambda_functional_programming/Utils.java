package lambda_functional_programming;

public class Utils {

    public static void aynisatirdabosluklaYazdir(Object obj) {
        System.out.print(obj + " ");

    }

    public static boolean ciftelemanisec(int x) {
        return x % 2 == 0;

    }

    public static int karesinial(int x) {
        return x * x;

    }

    public static boolean tekelemanisec(int x) {
        return x % 2 == 1;
    }

    public static int kupunual(int x) {
        return x * x * x;

    }
    public static double yarisinial(int x) {
        return x / 2;
    }

    public static char sonkarakter(String x) {
        return x.charAt(x.length()-1);
    }

    public static int rakamlarToplaminiAl(int x){

        int toplam = 0;

        while(x>0){
            toplam += x%10;
            x /= 10;

        }
        return toplam;
    }






}
