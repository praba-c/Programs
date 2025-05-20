package problems;

public class RomanToInteger {

    public static void main(String[] args) {

        String roman = "MCM";

        int[] arr = new int[120];
        arr['I'] = 1;
        arr['V'] = 5;
        arr['X'] = 10;
        arr['L'] = 50;
        arr['C'] = 100;
        arr['D'] = 500;
        arr['M'] = 1000;

        int ans = 0;
        for (int i=0;i<roman.length()-1;++i) {
            if (arr[roman.charAt(i)] < arr[roman.charAt(i+1)]) {
                ans -= arr[roman.charAt(i)];
            } else {
                ans += arr[roman.charAt(i)];
            }
        }
        ans += arr[roman.charAt(roman.length()-1)];
        System.out.println(ans);
    }
}