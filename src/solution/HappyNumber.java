package solution;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            int sum = 0;
            String[] num = String.valueOf(n).split("");
            for (String s : num) {
                sum += (int) Math.pow(Integer.parseInt(s), 2);
            }
            n = sum;
        }

        return n == 1;
    }
}
