// Last updated: 31/08/2025, 01:01:14
class Solution {
    public String greatestLetter(String s) {
        String res = "";
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        System.out.print(set);
        for (char z = 'Z'; z >= 'A'; z--) {

            if (set.contains(z) && set.contains(Character.toLowerCase(z))) {
                return res+z ;
            }

        }
        return res ;
    }

}