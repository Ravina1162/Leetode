class Solution {
    public int removeDuplicates(int[] nums) {
        int i,k=0;
        for(i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                nums[k]=nums[i];
                k++;
            }
        }
        nums[k]=nums[i];
        k+=1;
        return k;
    }
}