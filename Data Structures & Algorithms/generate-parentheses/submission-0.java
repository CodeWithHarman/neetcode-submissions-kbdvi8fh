class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String current, int open, int close, int n) {

        // Base case
        if (current.length() == n * 2) {
            result.add(current);
            return;
        }

        // Choice 1: Add '('
        if (open < n) {
            backtrack(result, current + "(", open + 1, close, n);
        }

        // Choice 2: Add ')'
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, n);
        }
    }
}
