class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();

        for(int num : nums){
            mp.put(num, mp.getOrDefault(num, 0)+1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[0]-b[0]);
        for(Map.Entry<Integer, Integer> ent : mp.entrySet()){
            pq.offer(new int[]{ent.getValue(), ent.getKey()});
            if(pq.size() > k){
                pq.poll();
            }
        }
        int[] res = new int[k];
        for(int i = 0; i<k; i++){
            res[i] = pq.poll()[1];
        }
        return res;
    }
}
