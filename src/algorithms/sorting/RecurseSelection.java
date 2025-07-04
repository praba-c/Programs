package algorithms.sorting;

import java.util.Arrays;

public class RecurseSelection {
    public static void main(String[] args) {
        int[] arr = {1, 20, 5, 16, 9, 12, 1};
        recurse(arr, arr.length, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void recurse(int[] a, int n, int index) {
        if (n == index) {
            return;
        }
        int k = minIndex(a, index, n-1);
        if (k != index) {
            int temp = a[index];
            a[index] = a[k];
            a[k] = temp;
        }
        recurse(a, n,index+1);
    }

    public static int minIndex(int[] a, int i, int j) {
        if (i == j) {
            return i;
        }
        int k = minIndex(a, i+1, j);
        return a[i] < a[k] ? i : k;
    }
}
