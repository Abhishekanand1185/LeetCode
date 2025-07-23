class Solution {
    public int maximumGain(String s, int x, int y) {
           if (x > y) {
            Result res1 = removeGains(s, 'a', 'b', x);
            Result res2 = removeGains(res1.remainingString, 'b', 'a', y);
            return res1.gain + res2.gain;
          } else {
            Result res1 = removeGains(s, 'b', 'a', y);
            Result res2 = removeGains(res1.remainingString, 'a', 'b', x);
            return res1.gain + res2.gain;
        }
    }
private static class Result {
        int gain;
        String remainingString;
        Result(int gain, String remainingString) {
            this.gain = gain;
            this.remainingString = remainingString;
        }
    }

    private static Result removeGains(String s, char first, char second, int gain) {
        Stack<Character> st = new Stack<>();
        int total = 0;

        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == first && c == second) {
                st.pop();
                total += gain;
            } else {
                st.push(c);
            }
        }
        StringBuilder remaining = new StringBuilder();
        for (char c : st) {
            remaining.append(c);
        }

        return new Result(total, remaining.toString());
    }
}