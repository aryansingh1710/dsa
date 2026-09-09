class Solution {
public:
    int strStr(string haystack, string needle) {

        int i = 0;
        int j = 0;

        while (i < haystack.length()) {

            if (haystack[i] == needle[j]) {
                i++;
                j++;

                // Complete needle found
                if (j == needle.length()) {
                    return i - j;
                }
            }
            else {
                // Mismatch hone par starting point se next position
                i = i - j + 1;
                j = 0;
            }

            // Remaining characters are fewer than needle
            if (haystack.length() - i < needle.length() - j) {
                return -1;
            }
        }

        return -1;
    }
};