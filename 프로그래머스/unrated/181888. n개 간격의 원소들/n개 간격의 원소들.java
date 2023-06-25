class Solution {
    public int[] solution(int[] num_list, int n) {
        int temp = num_list.length % n == 0 ? 0 : 1;
        int[] answer = new int[num_list.length / n + temp];
        int idx = 0;
        for(int i = 0; i < num_list.length; i++){
            if(i % n == 0) answer[idx++] = num_list[i];
        }
        return answer;
    }
}