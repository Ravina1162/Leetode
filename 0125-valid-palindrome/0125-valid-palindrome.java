class Solution {
    public boolean isPalindrome(String s) {
        String s1="",s2="";
        int d=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>=48&&ch<58){
             s1=s1+ch;
                s2=ch+s2;
            }
            if(ch>96&&ch<123)
            {
                s1=s1+ch;
                s2=ch+s2;
            }
        }
        if(s1.length()==1&&d>0)
            return false;
        if(s1.equals(s2))
            return true;
        return false;
    }
}