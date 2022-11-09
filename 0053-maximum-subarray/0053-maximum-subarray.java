class Solution {
    public int maxSubArray(int[] nums) {
        int s=0,g=nums[0];
        for(int i=0;i<nums.length;i++)
        {
             s=s+nums[i];
             g=(s>g)?s:g;
            if(s<0)
                s=0;
        }
        return g;
    }
}