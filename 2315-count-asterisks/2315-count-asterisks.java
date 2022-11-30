class Solution {
    public int countAsterisks(String s) {
        int c=0,a=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='|')
                c=c+1;
            else if(ch=='*'&&c%2==0)
                a=a+1;
        }
        return a;
    }
}