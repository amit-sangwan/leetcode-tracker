class Solution {
    int res = 0 ;

    public int minimumMoves(String s) {
       
       if(s.length() <4 && s.contains("X")){
        return 1;
       }
       if(s.indexOf("X")==-1){
        return 0;
       }
       return replace(s);
       }


    public int replace(String str){

        if( str.indexOf("X")+2 < str.length() && str.indexOf("X") != -1){
             res += 1;
             replace(str.substring(str.indexOf("X")+3 , str.length()));
        }else if(str.contains("X")){
            res+=1;
        }
        return res;
    }
}