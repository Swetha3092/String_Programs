class Solution {
    public int singleNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            int count=1;
            if(nums[i]==Integer.MIN_VALUE)
            continue;
         for(int j=i+1;j<nums.length;j++)
         {
            if(nums[i]==nums[j])
            {
                nums[j]=Integer.MIN_VALUE;
                count++;

            }
         }
         if(count==1)
         {
            sum+=nums[i];
         }
        }
       return sum; 
    }
}