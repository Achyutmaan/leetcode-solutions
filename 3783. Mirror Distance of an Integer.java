class Solution {
    public int mirrorDistance(int n) {
        int rem, rev = 0, temp = n;
        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;

        }
        int res = Math.abs(temp - rev);
        return res;
    }

}