//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
          Hashtable<Character,Integer> set=new Hashtable<Character,Integer>();
         int i=0,j=0,c=0;
         if(s.length()<k||k==0)
         return -1;
         while(j<s.length())
         {
             char ch=s.charAt(j);
             set.put(ch,j);
             if(set.size()==k)
             {
                 c=Math.max(c,j-i);
             }
             else if(set.size()>k)
             {
                 int d=j;
                 Set<Character> itr = set.keySet();
                 
                  for(Character key:itr) 
                  {
                    int l=set.get(key);
                      if(l<d)
                      {
                          d=l;
                          ch=key;
                      }
                      
                  }
                 i=set.get(ch)+1;
                 set.remove(s.charAt(d));
                 //c=Math.max(c,j-i);
             }
             ++j;
             
         }
        // c=Math.max(c,j-i);
        if(c==0&&k!=1)
        return -1;
         return c+1;
    }
}