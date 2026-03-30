class Solution {
    private List<String> li = new ArrayList<>();
    private String[] dig = { "", "",  "abc", "def","ghi", "jkl", "mno", "qprs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return li;
        backtr(0, "", digits);
        return li;
    }
    void backtr(int i, String cur, String digits){
        if(cur.length() == digits.length()){
            li.add(cur);
            return;
        }
        String chr = dig[digits.charAt(i) - '0'];
        for(char c : chr.toCharArray()){
            backtr(i+1, cur+c, digits);
        }
    }
}
