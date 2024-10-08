import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        ArrayList<Integer> answer = new ArrayList<>();
        while(n>0) {
            answer.add((int)(n%10));
            n /= 10;
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}