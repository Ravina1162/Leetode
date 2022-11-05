class Solution {
    public int[] nextGreaterElement(int[] n1, int[] n2) {
        int j;
        for(int i=0;i<n1.length;i++)
        {
            int dup=-1;
            for(j=n2.length-1;n2[j]!=n1[i]&&j>=0;j--)
                if(n2[j]>n1[i])
                    dup=n2[j];
                n1[i]=dup;
        }
        return n1;
    }
}