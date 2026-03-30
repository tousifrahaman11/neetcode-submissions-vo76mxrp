class Solution {
    public List<String> generateParenthesis(int n) {
        List<List<String>> li = new ArrayList<>();
        for(int i = 0; i<=n; i++){
            li.add(new ArrayList<>());
        }
        li.get(0).add("");
        for(int i  = 0; i<=n; i++){
            for(int j = 0; j<i; j++){
                for(String l : li.get(j)){
                    for(String r : li.get(i-j-1)){
                        li.get(i).add("(" + l + ")" + r);
                    }
                }
            }
        }
        return li.get(n);
    }
}
