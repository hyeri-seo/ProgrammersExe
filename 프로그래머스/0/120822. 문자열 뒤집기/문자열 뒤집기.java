class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=1; i<=my_string.length(); i++) {
            answer += my_string.substring(my_string.length()-i, my_string.length()-i+1);
        }
        return answer;
    }
}