class Solution {
    public int solution(int[] num_list) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        for (int a:num_list) {
            if(a%2==0) {
                even.append(a);
            } else {
                odd.append(a);
            }
        }
        return Integer.parseInt(odd.toString()) + Integer.parseInt(even.toString());
    }
}