package ex2;

import java.util.Arrays;

public class Main {
    public static void sorteaza(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int idx_min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    idx_min = j;
                }
            }

            if (min != arr[i]) {
                int temp = arr[i];
                arr[i] = arr[idx_min];
                arr[idx_min] = temp;
            }
        }
    }

    public static int[] interclaseaza(int[] t1, int[] t2) {

        int[] t3 = new int[t1.length + t2.length];
        int i, j, k;
        k = i = j = 0;

        while (i < t1.length && j < t2.length) {
            int v1 = t1[i];
            int v2 = t2[j];
            if (v1 < v2) {
                t3[k++] = v1;
                i++;
            } else if (v1 > v2) {
                t3[k++] = v2;
                j++;
            } else {
                t3[k++] = v1;
                t3[k++] = v2;
                i++;
                j++;
            }
        }

        while (i < t1.length) {
            t3[k++] = t1[i];
            i++;
        }
        while (j < t2.length) {
            t3[k++] = t2[j];
            j++;
        }
        return t3;
    }

    public static void main(String[] args) {
        int[] t1 = { 1, 7, 4, 3, 9, 1 };
        int[] t2 = { 6, 4, 2, 8 };

        System.out.println("Array1 initial: " + Arrays.toString(t1));
        sorteaza(t1);
        System.out.println("Array1 sortat crescător: " + Arrays.toString(t1));

        System.out.println("Array2 initial: " + Arrays.toString(t2));
        sorteaza(t2);
        System.out.println("Array2 sortat crescător: " + Arrays.toString(t1));

        int[] t3 = interclaseaza(t1, t2);
        System.out.println("Output:" + Arrays.toString(t3));
    }

}