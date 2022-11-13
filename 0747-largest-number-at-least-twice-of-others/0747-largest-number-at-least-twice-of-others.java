class Solution {
    public int dominantIndex(int[] nums) {
        int g=0,p=0,i;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]>g)
            {
                g=nums[i];
                p=i;
            }
        }
        //System.out.println(p);
        for(i=0;i<nums.length;i++)
        {
            if((nums[i]*2)>g && i!=p)
                break;
        }
        System.out.println(i);
        if(i==nums.length)
            return p;
        return -1;
    }
}