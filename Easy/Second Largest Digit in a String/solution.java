public class Solution {
    public static int secondHighest(String s) {
        int first = -1;
        int second = -1;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                int num = c - '0';

                if (num > first) {
                    second = first;
                    first = num;
                } else if (num < first && num > second) {
                    second = num;
                }
            }
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println(secondHighest("dfa12321afd"));
        System.out.println(secondHighest("abc1111"));
    }
}
