class Solution {
    public int findDuplicate(int[] nums) {
        int a[]=new int[nums.length],i;
        for(i=0;i<nums.length;i++)
        {
            int d=nums[i]-1;
            if(a[d]>0)
                break;
            else
                a[d]=d+1;
        }
        return nums[i];
    }
}