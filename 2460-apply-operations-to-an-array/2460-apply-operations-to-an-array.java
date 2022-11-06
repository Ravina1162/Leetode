class Solution {
    public int[] applyOperations(int[] n) {
        int m[]=new int[n.length];
        int i,p=0;
        for(i=0;i<n.length-1;i++)
        {
            if(n[i]==n[i+1] && n[i]!=0)
            {
                m[p]=n[i]*2;
                n[i+1]=0;
                p=p+1;
            }
            else if(n[i]!=0)
            {
                m[p]=n[i];
                p=p+1;
            }
        }
        m[p]=n[i];
        return m;
    }
}