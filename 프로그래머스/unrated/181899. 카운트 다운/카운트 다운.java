class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start - end + 1];
        int a = 0;
        for(int i = start; i >= end; i--){
            answer[a++] = i;
        }
        return answer;
    }
}