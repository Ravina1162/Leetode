class Solution {
    public int mySqrt(int x) {
        int i;
        if(x==0)
            return 0;
       int lb=1,ub=x,sq=0;
        while(lb<=ub){
            int mid = lb + (ub-lb)/2;
            if(mid <= x/mid){
                sq=mid;
                lb=mid + 1;
            }else{
                ub=mid -1;
            }
        }
        return sq;
        
    }
}