class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int num = 0;
        for(int i : num_list) {
            answer[num++] = i;
        }
        if(num_list[num_list.length - 1] > num_list[num_list.length - 2])
            answer[num] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        else
            answer[num] = (num_list[num_list.length - 1]) * 2;
        return answer;
    }
}