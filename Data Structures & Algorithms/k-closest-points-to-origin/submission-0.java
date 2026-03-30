class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing(a -> a[0]));
        for(int[] p : points){
            int dist = p[0] * p[0] + p[1] * p[1];
            pq.offer(new int[]{dist, p[0], p[1]});
        }
        int[][] res = new int[k][2];

        for(int i = 0; i<k; i++){
            int[] p = pq.poll();
            res[i] = new int[]{p[1], p[2]};
        }

        return res;
    }
}
