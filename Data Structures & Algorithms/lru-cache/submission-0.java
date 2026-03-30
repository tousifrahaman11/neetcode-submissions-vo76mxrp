class LRUCache {
    private ArrayList<int[]> cac;
    private int capacity;
    public LRUCache(int capacity) {
        this.cac = new ArrayList<>();
        this.capacity = capacity;
    }
    
    public int get(int key) {
        for(int i = 0; i<cac.size(); i++){
            if(cac.get(i)[0] == key){
                int[] tmp = cac.remove(i);
                cac.add(tmp);
                return tmp[1];
            }
        }
        return -1;
    }
    
    public void put(int key, int value) {
        for(int i = 0; i < cac.size(); i++){
            if(cac.get(i)[0] == key){
                int[] tmp = cac.remove(i);
                tmp[1] = value;
                cac.add(tmp);
                return;
            }
        }
        if(capacity == cac.size()){
            cac.remove(0);
        }
        cac.add(new int[] {key, value});
    }
}
