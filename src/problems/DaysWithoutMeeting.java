package problems;

public class DaysWithoutMeeting {

    public static void main(String[] args) {
        int[][] arr = {{1,7},{1,3},{9,10}};
        int days = 10;

        int[] day = new int[days];

        for (int[] array : arr) {
            if (array[0]-1 < days) {
                day[array[0] - 1]++;
            }
            if (array[1] < days) {
                day[array[1]]--;
            }
        }
        int count = 0;
        int meetings = 0;
        for (int i : day) {
            meetings += i;
            if (meetings == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
