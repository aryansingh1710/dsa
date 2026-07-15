class Solution {
public:
    vector<vector<int>> insert(vector<vector<int>>& a, vector<int>& newInterval) {
        a.push_back(newInterval);
        sort(a.begin(),a.end());
        int n=a.size();
        int start=a[0][0];
        int end=a[0][1];
        
        vector<vector<int>> res;

        for(int i=1;i<n;i++){
            int s=a[i][0];
            int e=a[i][1];

            if(end>=s){
                
                end=max(end,e);
                continue;
            }

            res.push_back({start,end});
            start=s;
            end=e;
        }
        res.push_back({start,end});
        return res;
    }
};