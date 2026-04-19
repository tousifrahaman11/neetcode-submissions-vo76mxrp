class Solution {
    public boolean validTree(int n, int[][] edges) {
        if(edges.length > n-1){
            return false;
        }
        List<List<Integer>> li = new ArrayList<>();
        for(int i = 0; i<n; i++){
            li.add(new ArrayList<>());
        }
        for(int[] edg : edges){
            li.get(edg[0]).add(edg[1]);
            li.get(edg[1]).add(edg[0]);
        }
        Set<Integer> vis = new HashSet<>();
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, -1});

        vis.add(0);

        while(!q.isEmpty()){
            int[] pair = q.poll();
            int node = pair[0], parent = pair[1];

            for(int nei : li.get(node)){
                if(nei == parent){
                    continue;
                }
                if(vis.contains(nei)){
                    return false;
                }
                vis.add(nei);
                q.offer(new int[] { nei, node});
            }
        }
        return vis.size() == n;
    }
}
