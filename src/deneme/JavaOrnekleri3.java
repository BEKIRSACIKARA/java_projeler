package deneme;

import java.util.Scanner;

class JavaOrnekleri3 {
    public static void main(String args[]) {

        int i, s = 0;
        int arr[] = new int[5];
        Scanner scan = new Scanner(System.in);

        System.out.print("5 tane sayı girin :");

        for (i = 0; i < 5; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print("\nçift sayılar : ");
        for (i = 0; i < 5; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(" " + arr[i]);
            }}
        System.out.print("\ntek sayılar : ");
        for (i = 0; i < 5; i++) {
        if (arr[i] % 2 != 0) {
                System.out.print(" " + arr[i]);
            }
        }
    }
}
