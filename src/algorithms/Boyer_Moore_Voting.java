package algorithms;

// TO FIND AN ELEMENT THAT APPEARS MORE THAN N/2 TIMES
public class Boyer_Moore_Voting {

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int count = 0, candidate = 0;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            count += (candidate == num) ? 1 : -1;
        }
        
        System.out.println(candidate);
    }
}
