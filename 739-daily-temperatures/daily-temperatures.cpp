class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& arr) {
        int n = arr.size();
        stack<pair<int,int>>st;
        vector<int> ans(n);
        for(int i=n-1;i>=0;i--){
            if(st.size()==0){
                ans[i]=0;
                st.push({arr[i],i});
            }
            else if(arr[i]<st.top().first){
                ans[i] = st.top().second - i;
                st.push({arr[i],i});
            }else{
                while(true){
                    st.pop();
                    if(st.size()==0){
                        st.push({arr[i],i});
                        ans[i] = 0;
                        break;
                    }

                    if(st.top().first > arr[i]){
                        ans[i] = st.top().second - i;
                        st.push({arr[i],i});
                        break;
                    }

                }
            }
        }
        return ans;
    }
};