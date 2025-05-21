package problems;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElement {

    public static void main(String[] args) {
        int k = 3;
        int[] arr = {2,5,1,4,8,8};

        // BOTH THESE METHODS INCLUDES DUPLICATES.!!!
        sort(arr, k);
        queue(arr, k);
    }

    public static void sort(int[] arr, int k) {
        Arrays.sort(arr);
        System.out.println(arr[arr.length-k]);
    }

    public static void queue(int[] arr, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int num : arr) {
            q.offer(num);
            if (q.size() > k) {
                q.poll();
            }
        }
        System.out.println(q.peek());
    }
}
