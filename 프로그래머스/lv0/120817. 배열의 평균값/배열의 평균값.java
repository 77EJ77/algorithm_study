class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int temp = 0;
        for(int i : numbers){
            temp += i;
        }
        answer = (double)temp / numbers.length;
        return answer;
    }
}