class Solution {
    List<List<Integer>> li;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        li = new ArrayList<>();

        Arrays.sort(candidates);
        dfs(candidates, target, 0, new ArrayList<>(), 0);
        return li;
    }
    void dfs(int[] candidates, int target, int i, List<Integer> cur, int tot){
        if(tot == target){
            li.add(new ArrayList<>(cur));
            return;
        }
        if(tot > target || i == candidates.length){
            return;
        }
        cur.add(candidates[i]);
        dfs(candidates, target, i+1, cur, tot+ candidates[i]);
        cur.remove(cur.size() -1);
        while(i + 1 < candidates.length && candidates[i] == candidates[i+1]){
            i++;
        }
        dfs(candidates, target, i+1, cur, tot);
    }
}
