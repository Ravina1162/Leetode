class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length,i;  
        Arrays.sort(nums);
        int k=0;
        n=1;
        for(i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                nums[k]=nums[i];
                k=k+1;
            }
        }
        nums[k]=nums[i];
        if(nums[k]==n)
            n=n+1;
        k=k+1;
                n=1;
        for(i=0;i<k;i++)
        {
            if(nums[i]>0)
            {
                if(nums[i]==n)
                {
                    n=n+1;
                }
                else
                {
                 break;   
                }
            }
        }
        return n;
    }
    }