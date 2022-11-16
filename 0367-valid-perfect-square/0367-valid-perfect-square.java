class Solution {
    public boolean isPerfectSquare(int num) {
         long lb=1,ub=num;
    while(lb<=ub){
        long mid=lb+(ub-lb)/2;
        if(mid*mid==num) return true;
    else if(mid*mid>num)
        ub=mid-1;
    else
         lb=mid+1;
    }
   return false;
    }
}

