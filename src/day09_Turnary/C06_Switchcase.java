package day09_Turnary;

public class C06_Switchcase {

    public static void main(String[] args) {
        /*
        kullanıcıdan gun gun ismi alın hafta içi mi yoksa hafta sonumu oldugunu gösterin
         */
        String input="pazar";
        input=input.toLowerCase();
        switch (input) {
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
            System.out.println("hafta içi");
            break;
            case "cumartesi":
            case "pazar":
            System.out.println("haftasonu");
            break;
            default:
                System.out.println("lütfen geçerli bir gün giriniz");
        }

    }

}
/*
eğer if yada else için de yeni kodlar varsa ternary ile yapamayız
 */