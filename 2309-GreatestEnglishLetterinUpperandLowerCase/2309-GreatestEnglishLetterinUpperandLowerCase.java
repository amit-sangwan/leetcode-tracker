// Last updated: 31/08/2025, 01:03:31
class Solution {
    public String greatestLetter(String s) {
         Set<Character> set = new HashSet<>();  // HashSet<Character> set = new HashSet<>(); -> HashSet H and S in caps
        for (char c : s.toCharArray()) {       // Character
            set.add(c);
        }
         for (char z = 'Z'; z >= 'A'; z--) {

            if (set.contains(z) && set.contains(Character.toLowerCase(z))) {
                return Character.toString(z) ;
            }

        }
        return "" ;
    }

}