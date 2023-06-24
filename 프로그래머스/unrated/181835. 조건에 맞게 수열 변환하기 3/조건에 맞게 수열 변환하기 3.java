class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        int i = 0;
        if(k % 2 == 1){
            for(int temp : arr){
                answer[i++] = temp * k;
            }
        } else {
            for(int temp : arr){
                answer[i++] = temp + k;
            }
        }
        return answer;
    }
}