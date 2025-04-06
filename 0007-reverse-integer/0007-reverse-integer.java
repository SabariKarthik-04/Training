class Solution {
    public int reverse(int x) {
        long res = 0;
        while(x!=0){
            int dig = x%10;
            res = res*10 +dig;
            x=x/10;
        }
        int r =(res < Integer.MIN_VALUE || res > Integer.MAX_VALUE)?0:(int)res;
        return r;
    }
}