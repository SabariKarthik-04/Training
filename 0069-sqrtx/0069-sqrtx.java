class Solution {
    public int mySqrt(int x) {
        int r=1,l=x,res=0;
        if(x==1 || x==0) return x;
        while(r<=l){
            int mid = r+(l-r)/2;
            if((long)mid*mid == x) return mid;
            else{
                if((long)mid*mid<x){
                    res =mid;
                    r=mid+1;
                }
                else{
                    l=mid-1;
                }
            }
        }
        return res;
    }
}