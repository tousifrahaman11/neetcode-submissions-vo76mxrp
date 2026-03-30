class Solution {
    private List<List<String>> li = new ArrayList<>();
    private List<String> li1 = new ArrayList<>();
    public List<List<String>> partition(String s) {
        dfs(0, 0, s);
        return li;
    }
    void dfs(int i, int j, String s){
        if(i >= s.length()){
            if( i == j){
                li.add(new ArrayList<>(li1));
            }
            return;
        }
        if(isPal(s, j, i)){
            li1.add(s.substring(j, i+1));
            dfs(i+1, i+1, s);
            li1.remove(li1.size()-1);
        }
        dfs(i+1, j, s);
    }
    private boolean isPal(String s, int l, int r){
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
