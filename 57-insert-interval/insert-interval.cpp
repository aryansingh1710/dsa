class Solution {
public:
    vector<vector<int>> insert(vector<vector<int>>& a, vector<int>& newInterval) {
        vector<vector<int>> temp;
        int n=a.size();
        
        bool insert = false;
        for(int i=0;i<n;i++){
          if(!insert and a[i][0]>=newInterval[0]){
            temp.push_back(newInterval);
            insert=true;
          } 
          temp.push_back(a[i]);
        }

        if(!insert){
            temp.push_back(newInterval);
        }
        
        vector<vector<int>> res;
        int start=temp[0][0];
        int end=temp[0][1];

        for(int i=1;i<temp.size();i++){
            int s=temp[i][0];
            int e=temp[i][1];

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