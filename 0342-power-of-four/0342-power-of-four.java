class Solution {
    public boolean isPowerOfFour(int n) {
        while(n>1)
            n=n%4==0?n/4:-1;
        if(n==1)
            return true;
        return false;
    }
}