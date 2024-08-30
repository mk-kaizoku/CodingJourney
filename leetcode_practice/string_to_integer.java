public class string_to_integer {
    class Solution {
        public int myAtoi(String s) {
            long res = 0;
            int sign = 1;
            int i = 0;
            while (i < s.length() && s.charAt(i) == ' ') {
                i++;
            }
            if (i >= s.length()) return 0;
            if (s.charAt(i) == '-') {
                sign = -1;
                i++;
            } else if (s.charAt(i) == '+') {
                i++;
            }
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                res = (res*10) + (s.charAt(i) - '0');
                if (res > Integer.MAX_VALUE) {
                    if (sign == 1) {
                        return Integer.MAX_VALUE;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                }
                i++;
            }
            return (int)res*sign;
        }
    }
}
