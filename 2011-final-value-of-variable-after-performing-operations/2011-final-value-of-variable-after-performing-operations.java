class Solution {
    public int finalValueAfterOperations(String[] s) {
        int x=0;
        for(int i=0;i<s.length;i++)
        {
            char ch=s[i].charAt(0);
            char ch1=s[i].charAt(2);
            if(ch=='-')
                x=x-1;
           else if(ch=='+')
                x=x+1;
            else if(ch1=='-')
                x=x-1;
            else
                x=x+1;
        }
        return x;
    }
}