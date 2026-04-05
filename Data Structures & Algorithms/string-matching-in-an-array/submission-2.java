class Solution {
    public List<String> stringMatching(String[] words) {
        String all = String.join(" ", words);
        List<String> res = new ArrayList<>();

        for (String w : words) {
            if (all.indexOf(w) != all.lastIndexOf(w)) {
                res.add(w);
            }
        }
        return res;
    }
}