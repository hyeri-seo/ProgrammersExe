class Solution {
    public String solution(String s) {
        String[] splitS = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < splitS.length; i++) {
            int num = Integer.parseInt(splitS[i]);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        String answer = min + " " + max;
        return answer;
    }
}