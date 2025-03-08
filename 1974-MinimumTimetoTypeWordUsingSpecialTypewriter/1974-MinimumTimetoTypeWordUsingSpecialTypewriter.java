class Solution {
    public int minTimeToType(String word) {

        int seconds =0;

        char pointerPosition = 'a';

         for(char targetChar : word.toCharArray()){
            seconds += 1+Math.min(Math.abs((int)(targetChar - pointerPosition )) , 26 - Math.abs((int)(targetChar - pointerPosition ))) ;
            pointerPosition = targetChar;
        }
       return seconds;
}
}
