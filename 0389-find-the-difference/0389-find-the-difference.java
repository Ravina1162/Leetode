class Solution {
    public char findTheDifference(String s, String t) {
     for(int i=0;i<s.length();i++)
     {
        String str=s.charAt(i)+"";
         t=t.replaceFirst(str,"");
     }
        return t.charAt(0);
    }
}