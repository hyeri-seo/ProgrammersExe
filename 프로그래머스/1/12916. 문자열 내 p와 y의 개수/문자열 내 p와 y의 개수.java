class Solution {
    boolean solution(String s) {
        int num1 = 0, num2 = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P') num1++;
            else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') num2++;
        }
        boolean answer = true;
        if(num1 != num2) answer = false;
        return answer;
    }
}