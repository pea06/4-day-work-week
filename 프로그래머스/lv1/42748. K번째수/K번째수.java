import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();
        for (int[] i : commands) {
            int[] slice = Arrays.copyOfRange(array, i[0] - 1, i[1] );
            slice = Arrays.stream(slice).sorted().toArray();
            answer.add(slice[i[2] - 1]);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}