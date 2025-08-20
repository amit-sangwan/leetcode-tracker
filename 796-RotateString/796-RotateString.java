// Last updated: 21/08/2025, 00:55:57
class Solution {
    public boolean rotateString(String s, String goal) {
        if(goal.length() != s.length()){
            return false ;
        }
        String f = s + s ; 
        if(f.contains(goal)){
            return true;
        }
        return false;
    }
}