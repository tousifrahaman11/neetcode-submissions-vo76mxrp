class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> mp = new HashMap<>();

        for(char c : s.toCharArray()){
            mp.put(c, mp.getOrDefault(c,0)+1);
        }

        for(char c : t.toCharArray()){
            if(!mp.containsKey(c)){
                return false;
            }
            mp.put(c, mp.get(c)-1);

            if(mp.get(c) == 0){
                mp.remove(c);
            }
        }
        return mp.isEmpty();
    }
}
