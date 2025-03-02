class Solution {
    public boolean areOccurrencesEqual(String s) {
        
            if (s.length() == 1) {
            return true;
        }

        char[] arr = s.toCharArray();

        HashMap<Character, Integer> mapper = new HashMap();

        for (char c : arr) {
            if (mapper.containsKey(c)) {
                mapper.put(c, (mapper.get(c) + 1));
            }
            if(!mapper.containsKey(c)){
                mapper.put(c, 1);}
        }

        Set<Integer> set1 = new HashSet<Integer>(mapper.values());
        System.out.println(set1);
        int size = set1.size();
        if (size > 1) {
            return false;
        } else
            return true;
    }
    }