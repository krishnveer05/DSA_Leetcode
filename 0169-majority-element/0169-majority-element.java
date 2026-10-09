class Solution {
    public int majorityElement(int[] nums) {
        int freq=1;
        int curr=nums[0];

        for(int i=1;i<nums.length;i++){
             if(nums[i]==curr){
                freq++;
             }
             else{
                 if(freq>0) freq--;
                 else{
                    curr=nums[i];
                    freq=1;
                 }
             }
        }
        return curr;
    }
}