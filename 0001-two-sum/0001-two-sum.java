class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int [] indices=new int[2];
        // for(int i = 0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             indices[0]=i;
        //             indices[1]=j;
        //             break;
        //         }
        //     }
        // }
        // return indices;
        HashMap<Integer,Integer> res = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp = target - nums[i];
            if(res.containsKey(comp)) return new int[]{res.get(comp),i};
            res.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}