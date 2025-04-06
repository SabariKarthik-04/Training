class Solution {
    static LinkedHashMap<Integer,String> res = new LinkedHashMap<>();
    public String intToRoman(int num) {
        init();
        String r="";
        for(Map.Entry<Integer,String> ent:res.entrySet()){
            int k = ent.getKey();
            while(num>=k){
                r+=ent.getValue();
                num-=k;
            }
        }
        return r;
    }
    public void init(){
        res.put(1000,"M");
        res.put(900,"CM");
        res.put(500,"D");
        res.put(400,"CD");
        res.put(100,"C");
        res.put(90,"XC");
        res.put(50,"L");
        res.put(40,"XL");
        res.put(10,"X");
        res.put(9,"IX");
        res.put(5,"V");
        res.put(4,"IV");
        res.put(1,"I");
    }
    
}