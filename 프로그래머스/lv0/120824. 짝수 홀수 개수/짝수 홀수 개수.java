class Solution {
    public int[] solution(int[] num_list) {
        int h = 0;
        int j = 0;
        for(int num : num_list){
            if(num % 2 == 0) h++;
            else j++;
        }
        int[] answer = {h, j};
        return answer;
    }
}