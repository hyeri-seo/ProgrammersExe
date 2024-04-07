class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        int count = 1;
        for(int i=0; i<=n; i++) {
            if(count > n) break;
            answer[i] = count;
            count += 2;
        }
        return answer;
    }
}