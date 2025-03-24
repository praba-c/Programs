
public class DaysWithoutMeeting {

    public static void main(String[] args) {
        int[][] arr = {{2,4},{1,6}};
        int days = 6;

        int[] day = new int[days];

        for (int[] array : arr) {
            for (int j=array[0]-1;j<array[1];++j) {
                day[j] = 1;
            }
        }

        int count = 0;
        for (int j : day) {
            if (j == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
