class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int temp1 = 1;
        int temp2 = 0;
        for(int i = 0; i < num_list.length; i++) {
            temp1 *= num_list[i];
            temp2 += num_list[i];
        }
        if(temp1 > temp2 * temp2) return 0;
        else return 1;
    }
}