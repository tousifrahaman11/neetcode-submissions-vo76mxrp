class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] c = new int[26];
        for(char ts : tasks){
            c[ts - 'A']++;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int cnt : c){
            if(cnt > 0){
                pq.add(cnt);
            }
        }
        int time = 0;
        Queue<int[]> q1 = new LinkedList<>();
        while(!pq.isEmpty() || !q1.isEmpty()){
            time++;

            if(!pq.isEmpty()){
                int cnt = pq.poll()-1;

                if(cnt > 0){
                    q1.add(new int[]{cnt, time+n});
                }
            }
            if(!q1.isEmpty() && q1.peek()[1] == time){
                pq.add(q1.poll()[0]);
            }
        }
        return time;
    }
}
