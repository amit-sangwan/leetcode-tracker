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
            System.out.println("if");
            res += 1;
            System.out.println(str);
            System.out.println(str.substring(str.indexOf("X")+3 , str.length()));
            replace(str.substring(str.indexOf("X")+3 , str.length()));
        }else if(str.contains("X")){
            System.out.println("else");

 
            res+=1;
        }
        return res;
    }
}