class Solution {
    public int minTimeToType(String word) {

        int seconds = word.length();

        char pointerPosition = 'a';

         for(char targetChar : word.toCharArray()){
            seconds = seconds + Math.min(Math.abs((int)(targetChar - pointerPosition )) , 26 - Math.abs((int)(targetChar - pointerPosition ))) ;
            pointerPosition = targetChar;
        }
       return seconds;
}
}