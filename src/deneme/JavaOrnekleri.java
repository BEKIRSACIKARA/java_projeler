package deneme;

import java.util.Scanner;
 
class JavaOrnekleri {
    public static void main(String args[]) {

        int i, j, temp;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("tersine çevirmek istediğiniz sayı adedini giriniz");
        int arr[] = new int[sc1.nextInt()];
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Sayıları Girin :");
 
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
 
        j = arr.length - 1;
        for (i = 0; i < j; i++) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        System.out.print("\nTerse Çevrilmiş Dizi :");
        for (i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
 
    }
}