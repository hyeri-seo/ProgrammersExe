class Solution {
    public int[] solution(String[] strlist) {
        int[] lengthArr = new int[strlist.length];
        for(int i=0; i<strlist.length; i++) {
            lengthArr[i] = strlist[i].length();
        }
        return lengthArr;
    }
}