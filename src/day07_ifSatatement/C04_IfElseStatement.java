package day07_ifSatatement;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class C04_IfElseStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char harf = scan.next().charAt(0);
        if ((harf > 'a' && harf <= 'z') || (harf > 'A' && harf <= 'Z')) {
            System.out.println("gİRİLEN KARAKTER BİR HARF");}
            else{
                System.out.println("girilen karakter bir harf defil");
            }
        }
    }

