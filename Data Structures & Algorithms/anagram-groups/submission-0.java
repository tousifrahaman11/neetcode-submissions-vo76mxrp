class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();

        for(String s : strs){
            //sort the char
            char[] arr = s.toCharArray(); //convert into array
            Arrays.sort(arr);
            String k = new String(arr);  //key
            
            mp.putIfAbsent(k, new ArrayList<>());
            mp.get(k).add(s);
        } 
        return new ArrayList<>(mp.values());
    }
}
