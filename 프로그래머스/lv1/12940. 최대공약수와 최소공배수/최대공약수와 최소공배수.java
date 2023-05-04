class Solution {
    public int[] solution(int n, int m) {
        int gcd = gcd(n,m);
        return new int[]{gcd, (n / gcd) * (m / gcd) * gcd};
    }
    int gcd(int n, int m) {
    int temp = n % m;
    if (temp == 0) {
        return m;
    }
    return gcd(m, temp);
}
}

