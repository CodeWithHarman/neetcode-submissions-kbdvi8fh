public class Solution {
    public String minRemoveToMakeValid(String s) {
        int openCnt = 0, closeCnt = 0;
        for (char c : s.toCharArray()) {
            if (c == ')') closeCnt++;
        }

        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (openCnt == closeCnt) continue;
                openCnt++;
            } else if (c == ')') {
                closeCnt--;
                if (openCnt == 0) continue;
                openCnt--;
            }
            res.append(c);
        }

        return res.toString();
    }
}