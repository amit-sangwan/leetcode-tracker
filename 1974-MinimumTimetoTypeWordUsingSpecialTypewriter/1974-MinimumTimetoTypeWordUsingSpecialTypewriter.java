class Solution {
    public int minTimeToType(String word) {

        int seconds = word.length();

        char pointerPosition = 'a';

         for(char targetChar : word.toCharArray()){

            int forward = Math.abs((int)(targetChar - pointerPosition ));
            System.out.println(forward);
            int backward = 26 - forward ;
            System.out.println(backward);

            int optimumMovement = Math.min(forward , backward);
            System.out.println(optimumMovement);

            seconds = seconds + optimumMovement ;
            pointerPosition = targetChar;
        }
       return seconds;
}
}