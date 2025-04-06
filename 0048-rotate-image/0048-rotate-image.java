class Solution {
    public void rotate(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[i].length;j++){
                int t=arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = t;
            }
        }
        for(int i=0;i<arr.length;i++){
            rev(arr[i]);
        }
    }
    void rev(int[] arr){
        int s=0,e=arr.length-1;
        while(s<e){
            int t=arr[s];
            arr[s++]= arr[e];
            arr[e--]=t;
        }
    }
}