class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";

        // frequency map of chars we need
        Map<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int balance = t.length(); // total chars still needed
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {
            char r = s.charAt(right);

            // if char is needed
            if (need.containsKey(r)) {
                if (need.get(r) > 0) {
                    balance--; // satisfied one needed char
                }
                need.put(r, need.get(r) - 1);
            }

            // when window satisfies t
            while (balance == 0) {
                // update minimum window
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char l = s.charAt(left);

                if (need.containsKey(l)) {
                    need.put(l, need.get(l) + 1);
                    if (need.get(l) > 0) {
                        balance++; // window no longer valid
                    }
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }
}

