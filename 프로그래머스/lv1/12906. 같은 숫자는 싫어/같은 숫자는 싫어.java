import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = new int[arr.length];
        int temp = -1;
        int idx = 0;
        for (int a : arr) {
            if (a != temp) {
                answer[idx++] = a;
                temp = a;
            }
        }
        return Arrays.copyOf(answer, idx);
    }
}