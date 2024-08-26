class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans=new StringBuilder();
        Arrays.sort(strs);
        String f=strs[0];
        String s=strs[strs.length-1];
        for(int i=0;i<Math.min(f.length(),s.length());i++){
            if(f.charAt(i)!=s.charAt(i)){
                return ans.toString();
            }
            ans.append(f.charAt(i));
        }
        return ans.toString();
    }
}