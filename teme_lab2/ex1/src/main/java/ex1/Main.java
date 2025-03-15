package ex1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // citim n
        int n;
        do {
            n = sc.nextInt();
        } while (!(n >= 0 && n <= 5));

        // citim tabloul
        int[] tablou = new int[n];
        for (int i = 0; i < tablou.length; i++) {
            tablou[i] = sc.nextInt();
        }

        // inversare
        for (int i = 0; i < tablou.length / 2; i++) {
            int temp = tablou[i];
            tablou[i] = tablou[tablou.length - i - 1];
            tablou[tablou.length - i - 1] = temp;
        }

        System.out.println(Arrays.toString(tablou));

        sc.close();

    }
}