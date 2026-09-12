class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {

        vector<int>arr(nums1.size(),-1);
        unordered_map<int,int>map;
        for(int i=0;i<nums1.size();i++){
            map[nums1[i]]=i;
        }
        stack<int>st;
        for(int i=nums2.size()-1;i>=0;i--){
            if(map.find(nums2[i]) != map.end()){
                if(st.size()==0){
                    arr[map[nums2[i]]]=-1;
                    st.push(nums2[i]);
                }else if(nums2[i]<st.top()){
                    arr[map[nums2[i]]] = st.top();
                    st.push(nums2[i]);
                }else{
                    while(!st.empty() && st.top() <= nums2[i]) {
                      st.pop();
                    }
                    if(st.size()==0){
                    arr[map[nums2[i]]] = -1;
                    }else{
                    arr[map[nums2[i]]] = st.top();
                    }
                    st.push(nums2[i]);
                }
            }else{
                st.push(nums2[i]);
            }
        }

        return arr;
        
    }
};