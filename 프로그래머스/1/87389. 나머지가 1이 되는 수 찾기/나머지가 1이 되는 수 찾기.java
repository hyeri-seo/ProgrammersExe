class Solution {
    public int solution(int n) {
        int x;
        for(x=2; x<n; x++) {
            if(n%x==1) {
                return x;
            }
        }
        return -1;
    }
}