import java.util.*;
class Solution {
    public String sortSentence(String s) {
        int c=1;
        String w="";
       for(int i=0;i<s.length();i++)
           if(s.charAt(i)==' ')
               c=c+1;
        String a[]=new String[c];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' '&&ch>58)
                w=w+ch;
            if(ch>=48&&ch<=58)
            {
                int d=(int)ch-49;
                a[d]=w;
                w="";
            }
        }
        for(int i=0;i<c;i++)
            w=w+a[i]+" ";
        return w.trim();
    }
}