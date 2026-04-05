class Solution {

    int index = 0;

    public int calculate(String s) {
        return helper(s);
    }

    private int helper(String s) {

        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char sign = '+';

        while (index < s.length()) {

            char ch = s.charAt(index);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            if (ch == '(') {
                index++;
                num = helper(s);
            }

            if ((!Character.isDigit(ch) && ch != ' ') || index == s.length() - 1) {

                if (sign == '+') {
                    stack.push(num);
                } else if (sign == '-') {
                    stack.push(-num);
                } else if (sign == '*') {
                    stack.push(stack.pop() * num);
                } else if (sign == '/') {
                    stack.push(stack.pop() / num);
                }

                sign = ch;
                num = 0;
            }

            if (ch == ')') {
                break;
            }

            index++;
        }

        int sum = 0;
        for (int n : stack) {
            sum += n;
        }

        return sum;
    }
}

