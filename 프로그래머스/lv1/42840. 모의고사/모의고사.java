import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] n1 = new int[]{1, 2, 3, 4, 5};
        int[] n2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] n3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] cnt = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == n1[i%5]) {
                cnt[0]++;
            }
            if(answers[i] == n2[i%8]) {
                cnt[1]++;
            }
            if(answers[i] == n3[i%10]) {
                cnt[2]++;
            }
        }

        int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            if(max == cnt[i]) {
                list.add(i+1);
            }
        }

            return list.stream().mapToInt(Integer::intValue).toArray();
    }
}