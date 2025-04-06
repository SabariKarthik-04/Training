class Solution {
    public String multiply(String num1, String num2) {
        int n1_l=num1.length();
        int n2_l=num2.length();
        int[] products=new int[n1_l+n2_l];
        for(int i=n1_l-1;i>=0;i--){
            for(int j=n2_l-1;j>=0;j--){
                int n1=num1.charAt(i)-'0';
                int n2=num2.charAt(j)-'0';
                    products[i+j+1]+=n1*n2;
            }
        }
        int c=0;
        for(int i=products.length-1;i>=0;i--){
            int tmp=(products[i]+c)%10;
            c=(products[i]+c)/10;
            products[i] =tmp;
        }
        StringBuilder s=new StringBuilder();
        for(int n:products){
            s.append(n);
        }
        while (s.length() != 0 && s.charAt(0) == '0') s.deleteCharAt(0);
        return s.length() == 0 ? "0" : s.toString();
    }
}