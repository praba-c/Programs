public class Subarray {

    public static void main(String[] args) {
        int[] arr = {1,4,20,3,10,5};
        int target = 9, sum = 0;
        if (checkTarget(arr, target, sum)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean checkTarget(int[] arr, int target, int sum) {
        for (int i=0;i<arr.length-1;++i) {
            sum = arr[i];
            if (sum == target) {
                return true;
            }
            for (int j=i+1;j<arr.length;++j) {
                sum += arr[j];
                if (sum == target) {
                    return true;
                }
                if (sum > target) {
                    break;
                }
            }
        }
        return false;
    }
}
