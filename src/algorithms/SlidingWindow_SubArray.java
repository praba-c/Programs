package algorithms;

// TO CHECK IF THE TARGET PRESENT IN ANY OF THE CONTIGUOUS SUB-ARRAY
public class SlidingWindow_SubArray {

    public static void main(String[] args) {
        int[] arr = {1,4,20,3,10,5};
        int target = 25;
        if (checkTarget(arr, target)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean checkTarget(int[] arr, int target) {
        int sum = 0, start = 0;
        for (int i=0;i<arr.length;++i) {
            sum += arr[i];

            while (sum > target && start <= i) {
                sum -= arr[start];
                start++;
            }

            if (sum == target) {
                return true;
            }
        }
        return false;
    }
}
