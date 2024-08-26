class Solution {
    public int countPairs(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(isOk(nums[i],nums[j])){
                    ans++;
                }
            }
        }
        return ans;

    }
    boolean isOk(int a,int b){
        String x=String.valueOf(a);
        String y=String.valueOf(b);
        while(x.length()<y.length()){
            x="0"+x;
        }
        while(y.length()<x.length()){
            y="0"+y;
        }
        int len=x.length();
        int count=0;
        int[]arr=new int[2];
        for(int i=0;i<len;i++){
            if(x.charAt(i)!=y.charAt(i)){
                if(count==2) return false;
                arr[count]=i;
                count++;
            }
            
        }
        return (count==0)||((count==2)&& x.charAt(arr[0])==y.charAt(arr[1])&& x.charAt(arr[1])==y.charAt(arr[0]));
    }
}