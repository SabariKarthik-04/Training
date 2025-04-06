class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        return x==rev(x,0);
    }
    int rev(int x,int res){
        if(x==0) return res;
        res=(res*10)+(x%10);
        return rev(x/10,res);
    }
}