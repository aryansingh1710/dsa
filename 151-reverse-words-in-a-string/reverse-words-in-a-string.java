class Solution {
    public String reverseWords(String s) {

        int l = 0;
        int r = s.length() - 1;

        // trim left
        while (l <= r && s.charAt(l) == ' ') l++;

        // trim right
        while (r >= l && s.charAt(r) == ' ') r--;

        StringBuilder sB = new StringBuilder();

        // remove extra spaces
        while (l <= r) {
            if (s.charAt(l) != ' ') {
                sB.append(s.charAt(l));
            } else if (sB.length() > 0 && sB.charAt(sB.length() - 1) != ' ') {
                sB.append(' ');
            }
            l++;
        }

        // reverse whole string
        reverse(sB, 0, sB.length() - 1);

        // reverse each word
        int start = 0;
        for (int end = 0; end <= sB.length(); end++) {
            if (end == sB.length() || sB.charAt(end) == ' ') {
                reverse(sB, start, end - 1);
                start = end + 1;
            }
        }

        return sB.toString();
    }

    private void reverse(StringBuilder sB, int i, int j) {
        while (i < j) {
            char temp = sB.charAt(i);
            sB.setCharAt(i, sB.charAt(j));
            sB.setCharAt(j, temp);
            i++;
            j--;
        }
    }
}