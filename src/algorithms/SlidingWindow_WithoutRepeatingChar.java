package algorithms;

import java.util.HashSet;
import java.util.Set;

public class SlidingWindow_WithoutRepeatingChar {

    public static void main(String[] args) {
        String string = "abcdabcbbcdef";
        int max = 0, j = 0;
        Set<Character> set = new HashSet<>();

        for (int i=0;i<string.length();++i) {
            char c = string.charAt(i);

            while (set.contains(c)) {
                set.remove(string.charAt(j));
                j++;
            }
            set.add(c);
            max = Math.max(max, i-j+1);
        }
        System.out.print(max);
    }
}
