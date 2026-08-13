class Solution {
public:
    bool backspaceCompare(string s, string t) {

        int n = s.size();
        int m = t.size();

        stack<char> st;
        stack<char> rt;

        // Process s
        for(int i = 0; i < n; i++) {

            if(s[i] != '#') {
                st.push(s[i]);
            }
            else {
                if(!st.empty()) {
                    st.pop();
                }
            }
        }

        // Process t
        for(int i = 0; i < m; i++) {

            if(t[i] != '#') {
                rt.push(t[i]);
            }
            else {
                if(!rt.empty()) {
                    rt.pop();
                }
            }
        }

        return st == rt;
    }
};