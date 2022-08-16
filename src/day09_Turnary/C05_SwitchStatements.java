package day09_Turnary;

import java.util.Scanner;

public class C05_SwitchStatements {

    public static void main(String[] args) {
        /*
        kullanıcıdan gun numarası alıp 1 ise pazartesi .....7 ise pazar yazalım
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen  kaçıncı gün olduğunu giriniz");
/*
switch yanına yazılan () neye gore case atılacağını göesterir
 */
        int gunNo=scan.nextInt();
        switch (gunNo){
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("gecerli gün numarası giriniz");




        }
    }
    }

/*
eğer if yada else için de yeni kodlar varsa ternary ile yapamayız
 */