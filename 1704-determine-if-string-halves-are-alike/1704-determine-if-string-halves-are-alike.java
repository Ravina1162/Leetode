class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                if(i<(s.length()/2))
                    ++c;
                else
                    --c;
            }
        }
        if(c==0)
            return true;
        return false;
    }
}