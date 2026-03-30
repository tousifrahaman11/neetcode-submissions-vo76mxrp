class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>>  mp = new HashMap<>();

        for(String s : strs){
            int[] con = new int[26];
            for(char c : s.toCharArray()){
                con[c-'a']++;
            }
            String key = Arrays.toString(con);
            mp.putIfAbsent(key, new ArrayList<>());
            mp.get(key).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}
