class Solution {
    public int solution(int n) {
        int answer = 0;
        int temp = 0;
        while(n >= temp) {
            answer += temp;
            temp += 2;
        }
        return answer;
    }
}