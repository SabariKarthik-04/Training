class Solution {
    static HashMap<Character,Integer> val= new HashMap<>();
    public int romanToInt(String s) {
        init();
        return rtoi(s);
    }
    void init(){
        val.put('I',1);
        val.put('V',5);
        val.put('X',10);
        val.put('L',50);
        val.put('C',100);
        val.put('D',500);
        val.put('M',1000);
    }
    int rtoi(String s){
        int res=0;
        for(int i=0;i<s.length();i++){
            if(i<s.length()-1 && val.get(s.charAt(i))<val.get(s.charAt(i+1))){
                res-=val.get(s.charAt(i));
            }
            else res+=val.get(s.charAt(i));
        }
        return res;
    }
}