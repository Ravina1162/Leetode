//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int k)
    {
        long a[]=new long[N-k+1];
        int i=0,j=0;
         Deque<Long> de = new ArrayDeque<>();
        while(j<N)
        {
            if(A[j]<0)
                de.add(A[j]);
               
            if(j-i+1==k)
            {
                if(de.size()>0){
                a[i]=de.getFirst();
                 long num=A[i];
                 if(num==de.getFirst())
                de.pollFirst();
               }
               else
               {
                   a[i]=0;
               }
               ++i;
            }
            ++j;
        }
        return a;
    }
}