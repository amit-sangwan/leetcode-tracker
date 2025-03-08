class Solution {
    public int minTimeToType(String word) {
        int time = 0;
        char curr = 'a';
        for(int i=0;i<word.length();i++){
            char goal = word.charAt(i);
            int dist = Math.abs(goal - curr);
            int circ = 26 - dist;
            time = time + 1 +Math.min(circ,dist);
            curr = goal;
        }
        return time;
    }
}