import java.util.*;
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String str="";
        int j;
        for(int i=0;i<s.length();i++)
        {
            str=str+s.charAt(i);
            int k=0;
            for(j=i+1;j<=s.length()-str.length();j=j+str.length())
            {
                if(s.substring(j,j+str.length()).equals(str))
                    ++k;
                else
                    break;
            }
            if(k>0)
            if((k+1)*str.length()==s.length())
                return true;
        }
        return false;
    }
}