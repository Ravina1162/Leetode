class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0;i<heights.length;i++)
        {
            for(int j=0;j<heights.length;j++)
            {
                if(heights[i]>heights[j])
                {
                    int dup=heights[i];
                    heights[i]=heights[j];
                    heights[j]=dup;
                    String s=names[i];
                    names[i]=names[j];
                    names[j]=s;
                }
            }
        }
        return names;
    }
}