class Solution {
    public int[] buildArray(int[] n) {
        int m[]=new int[n.length];
        for(int i=0;i<n.length;i++)
            m[i]=n[n[i]];
        return m;
    }
}