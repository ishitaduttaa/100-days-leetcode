class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int m = n*2;
        int[] nums2 = new int[m];
        for(int i=0;i<m;i++){
            if(i<n){
                nums2[i]=nums[i];}
            if(i<m & i>=n){
                nums2[i]=nums[i-n];
            }
        }
        return nums2;
    }
}