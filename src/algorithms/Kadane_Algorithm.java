package algorithms;

// TO FIND THE MAXIMUM SUM OF THE SUB-ARRAY
public class Kadane_Algorithm {

    public static void main(String[] args) {
        int[] array = {-1, -4, 6, 8};

        int currSum = array[0];
        int maxSum = array[0];

        for (int i=1;i<array.length;++i) {
            if (array[i] > currSum + array[i]) {
                currSum = array[i];
            } else {
                currSum += array[i];
            }
            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }
        System.out.println(maxSum);
    }

}
