class Solution {
    public String restoreString(String s, int[] indices) {
        String s1[]=new String[indices.length];
        String re="";
        for(int i=0;i<s.length();i++)
        {
            s1[indices[i]]=s.charAt(i)+"";
        }
        for(int i=0;i<s.length();i++)
            re=re+s1[i];
        return re;
       
    }
}