class Solution {
    public int[] getConcatenation(int[] nums) {
        int len=nums.length;
        int n[]=new int[2*len];
        for(int i=0;i<nums.length;i++)
        {
            n[i]=nums[i];
            n[i+len]=nums[i];
        }  
        return n;      
    }
}
