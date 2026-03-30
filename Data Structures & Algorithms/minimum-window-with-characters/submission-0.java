class Solution {
    public String minWindow(String s, String t) {
        if(t.isEmpty() ) return "";

        Map<Character, Integer> mp1 = new HashMap<>();
        Map<Character, Integer> mp2 = new HashMap<>();

        for(char c : t.toCharArray()){
            mp1.put(c, mp1.getOrDefault(c, 0) +1);

        }
        int hv = 0, nd = mp1.size();
        int[] res = {-1, -1};
        int resL = Integer.MAX_VALUE;
        int l = 0;

        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            mp2.put(c, mp2.getOrDefault(c, 0)+1);
            if(mp1.containsKey(c) && mp2.get(c).equals(mp1.get(c))){
                hv++;
            }
            while(hv == nd){
                if((r-l+1) < resL){
                    resL = r-l+1;
                    res[0] = l;
                    res[1] = r;
                }

                char lf = s.charAt(l);
                mp2.put(lf, mp2.get(lf)-1);
                if(mp1.containsKey(lf) && mp2.get(lf) < mp1.get(lf)){
                    hv--;
                }
                l++;
            }
        }
        return resL == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1]+1);
    }
}
