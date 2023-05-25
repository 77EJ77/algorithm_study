class Solution {
    public int[] solution(int money) {
        int co = money/5500;
        int ch = money % 5500;
        //if(co > 0) ch = money % 5500;
        int[] answer = {co, ch};
        return answer;
    }
}