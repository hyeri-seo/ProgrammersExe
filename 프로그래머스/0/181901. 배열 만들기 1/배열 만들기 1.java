class Solution {
    public int[] solution(int n, int k) {
        int[] arr = new int[n/k];
        for(int i=0; i<n/k; i++) {
            arr[i] = (i+1)*k;
        }
        return arr;
    }
}