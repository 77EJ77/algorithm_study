class Solution {
    public String[] solution(String[] names) {
        int cnt = (names.length / 5) + (names.length % 5 == 0 ? 0 : 1);
        String[] answer = new String[cnt];
        int temp = 0;
        for(int i = 0; i < names.length; i++){
            if(i % 5 == 0) answer[temp++] = names[i];
        }
        return answer;
    }
}