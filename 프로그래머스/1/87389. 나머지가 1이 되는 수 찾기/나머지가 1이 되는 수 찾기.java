class Solution {
    public int solution(int n) {
        for(int x=2; x<=Math.sqrt(n); x++) {
            if(n%x==1) {
                return x;
            }
        }
        return n-1;
    }
}