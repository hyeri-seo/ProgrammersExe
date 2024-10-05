import java.util.Arrays;

class Solution {
    public long solution(long n) {
        // valueOf: ? -> 문자열
        // toCharArray: 문자열 -> 문자 배열
        char[] digits = String.valueOf(n).toCharArray();
        Arrays.sort(digits);
        StringBuilder sb = new StringBuilder(new String(digits)).reverse();
        return Long.parseLong(sb.toString());
    }
}