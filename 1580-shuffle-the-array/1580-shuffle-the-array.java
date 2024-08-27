class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []arr=new int[nums.length];
        for(int i=0;i<n;i++){
            arr[2*i]=nums[i];
        }
        int c=0;
        for(int i=n;i<nums.length;i++){
            arr[2*c+1]=nums[i];
            c++;
        }
        return arr;
    }
}