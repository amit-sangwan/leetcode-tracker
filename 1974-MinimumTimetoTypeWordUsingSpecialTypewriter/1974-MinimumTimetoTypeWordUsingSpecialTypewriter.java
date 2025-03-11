class Solution {
    public int minTimeToType(String word) {

        int res = word.length();
        char pointer = 'a';

        for(char c : word.toCharArray()){
        
          int frw = Math.abs( (int)c - (int)pointer);
          int bck = 26-frw ;
          res +=  Math.min(frw ,bck);

          pointer = c ;
        }
        return res;
    }
}