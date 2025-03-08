class Solution {
    public int minTimeToType(String word) {

        int seconds = word.length();

        char pointerPosition = 'a';

         for(char targetChar : word.toCharArray()){

            int forward = Math.abs((int)(targetChar - pointerPosition ));
             int backward = 26 - forward ;
 
            int optimumMovement = Math.min(forward , backward);
 
            seconds = seconds + optimumMovement ;
            pointerPosition = targetChar;
        }
       return seconds;
}
}