struct  cmp{
    bool operator()(string a,string b){
        string a1 = a+b;
        string a2 = b+a; 
        return a1<a2;
    
    }
};
class Solution {
public:

    string largestNumber(vector<int>& nums) {

        int count = 0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==0){
                count++;
            }
        }

        if(count == nums.size()) return "0";

       priority_queue<string, vector<string>, cmp> pq;
        for(int i=0;i<nums.size();i++){
            pq.push(to_string(nums[i]));
        }
        string str = "";
        while(pq.size()){
            str = str + pq.top();
            pq.pop();
        }
        return str;
        
        
    }
};