class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        int i = 0;
        for(int temp : arr){
            if(temp >= 50 && temp % 2 == 0) temp = temp / 2;
            else if(temp < 50 && temp % 2 == 1) temp = temp * 2;
            answer[i++] = temp;
        }
        return answer;
    }
}