class Solution {
    public int minTimeToType(String word) {

        int res = 0;
        char pointer = 'a';

        for(char c : word.toCharArray()){
        
          int frw = Math.abs( (int)c - (int)pointer);
          int bck = 26-frw ;
          res +=  Math.min(frw ,bck);

          pointer = c ;
          res+=1;
        }
        return res;
    }
}