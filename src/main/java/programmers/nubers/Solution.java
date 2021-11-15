package programmers.nubers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {

        var phoneBook = new String[] {"119", "97674223", "1195524421"};

        Solution solution = new Solution();
        System.out.println(solution.solution(phoneBook));
    }

    public boolean solution(String[] phoneBook) {
        List<String> sorted = Arrays.stream(phoneBook).sorted().collect(Collectors.toList());

        for (int i = 0; i < sorted.size(); i++) {
            String current = sorted.get(i);
            if (i + 1 == sorted.size()) {
                return true;
            }

            String next = sorted.get(i + 1);
            if (next.startsWith(current)) {
                return false;
            }
        }
        return true;
    }
}
