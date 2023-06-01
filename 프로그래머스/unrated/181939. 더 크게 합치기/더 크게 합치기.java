class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int temp1 = Integer.parseInt(a + "" + b);
        int temp2 = Integer.parseInt(b + "" + a);
        answer = (temp1 >= temp2) ? temp1 : temp2;
        return answer;
    }
}