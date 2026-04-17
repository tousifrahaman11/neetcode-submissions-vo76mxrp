class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> li = new ArrayList<>();
        int[] id = new int[numCourses];
        Queue<Integer> q1 = new LinkedList<>();

        //intializing graph
        for(int i = 0; i<numCourses;i++){
            li.add(new ArrayList<>());
        }

        int n = prerequisites.length;
        for(int i = 0; i < n; i++){
            int a = prerequisites[i][0];
            int b = prerequisites[i][1];

            li.get(b).add(a);
            id[a]++;
        }
        for(int i = 0; i< numCourses; i++){
            if(id[i] == 0) {
                q1.offer(i);
            }
        }
        int c = 0;
        while(!q1.isEmpty()){
            int co = q1.poll();
            c++;

            for(int nx : li.get(co)){
                id[nx]--;

                if(id[nx] == 0){
                    q1.offer(nx);
                }
            }
        }
        return c == numCourses;
    }
}
