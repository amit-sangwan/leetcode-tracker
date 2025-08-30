// Last updated: 31/08/2025, 01:00:42
class Solution {
    public String greatestLetter(String s) {

        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        System.out.print(set);
        for (char z = 'Z'; z >= 'A'; z--) {

            if (set.contains(z) && set.contains(Character.toLowerCase(z))) {
                return new StringBuilder().append(z).toString();
            }

        }
        return "";
    }

}