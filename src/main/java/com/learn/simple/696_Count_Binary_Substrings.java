class Solution {
    public int countBinarySubstrings(String s) {
        int[] nums = new int[s.length()];
        nums[0]=1;
        int x=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1) != s.charAt(i)){
                nums[++x]=1;
            }else{
                nums[x]++;
            }
        }
        
        int result = 0;
        for(int i=1;i<=x;i++){
            result +=Math.min(nums[i-1],nums[i]);
        }
        return result;
    }
}
