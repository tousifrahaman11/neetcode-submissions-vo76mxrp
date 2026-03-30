class MedianFinder {

    private ArrayList<Integer> dt;
    public MedianFinder() {
        dt = new ArrayList<>();
    }
    
    public void addNum(int num) {
        dt.add(num);
    }
    
    public double findMedian() {
        Collections.sort(dt);
        int n = dt.size();
        if((n & 1) == 1){
            return dt.get(n / 2);
        } else{
            return (dt.get(n/2) + dt.get(n/2 -1)) / 2.0;
        }
    }
}
