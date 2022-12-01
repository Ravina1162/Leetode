class Solution {
    public int thirdMax(int[] nums) {
        int p=0,c=1;
        for(int i=0;i<nums.length;i++)
        {
            int d=nums[i];
            p=i;
            for(int j=i+1;j<nums.length;j++)
            {
             if(d<nums[j])
             {
                d=nums[j];
                 p=j;
             }
            }
            nums[p]=nums[i];
            nums[i]=d;
            System.out.println(d+" "+i);
            if(i>0)
            {
                if(nums[i-1]!=nums[i])
                {
                    c=c+1;
                   // System.out.println(c);
                }
                if(c==3)
                {
                    return d;
                }
            }
                
        }
        return nums[0];
    }
}