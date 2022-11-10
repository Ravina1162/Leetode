class Solution {
    public String removeDuplicates(String s) {
        int i;
        String s1=" ";
        s=s+" ";
        for(i=0;i<s.length()-1;i++)
        {
            char ch=s.charAt(i);
            if(ch==s.charAt(i+1)){
            
               i=i+1;
        }
       else
        {
                if(s1.charAt(s1.length()-1)==ch)
                    s1=s1.substring(0,s1.length()-1);
                else
                    s1=s1+ch;
                
        }
        }
        //if(i==s.length()-1)
          //  s1=s1+s.charAt(i);
        return s1.trim();
    }
    
}