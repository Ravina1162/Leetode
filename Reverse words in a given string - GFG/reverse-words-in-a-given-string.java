//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        S="."+S;
        String s1="",s2="";
        for(int i=S.length()-1;i>=0;--i)
        {
            char ch=S.charAt(i);
            if(ch!='.')
            s2=ch+s2;
            else
            {
                s1=s1+s2+".";
                s2="";
            }
        }
        s1=s1.substring(0,S.length()-1);
        return s1;
    }
}