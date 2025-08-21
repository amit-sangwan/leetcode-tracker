// Last updated: 21/08/2025, 14:38:14
class Solution {
    public int minimumMoves(String s) {
        int i = 0 ; 
        int sum = 0 ;
        while(i< s.length()){
            if(s.charAt(i)=='X'){
                sum += 1;
                i +=3;
                continue;
            }
            i++;
        }
        return sum;
      
}
}