class Solution {
    public int[] solution(int n1, int d1, int n2, int d2) {
        int denom = 0;
        int number = 0;
        for(int i=1; i<=Math.min(d1*d2, d2*n1+d1*n2); i++) {
            if((d1*d2)%i==0 && (d2*n1+d1*n2)%i==0) {
                denom = (d1*d2)/i;
                number = (d2*n1+d1*n2)/i;
            }
        }
        int[] answer = {number, denom};
        return answer;
    }
}