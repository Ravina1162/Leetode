class Solution {
    public String makeGood(String s) {
        String s1=" ";
        int i;
     for(i=0;i<s.length()-1;i++)
     {
         if(s.charAt(i)+32==s.charAt(i+1)||s.charAt(i)==s.charAt(i+1)+32)
         {
             i=i+1;
         }
         else
         {
             if(s1.charAt(s1.length()-1)==s.charAt(i)+32||s1.charAt(s1.length()-1)+32==s.charAt(i))
                 s1=s1.substring(0,s1.length()-1);
             else
                 s1=s1+s.charAt(i);
         }
     }
        if(i==s.length()-1){
            if(s1.charAt(s1.length()-1)==s.charAt(i)+32||s1.charAt(s1.length()-1)+32==s.charAt(i))
                 s1=s1.substring(0,s1.length()-1);
            else
                s1+=s.charAt(i);
        }
        return s1.trim();
    }
}
