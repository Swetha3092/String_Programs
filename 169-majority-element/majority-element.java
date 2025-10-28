class Solution {
    int max=Integer.MIN_VALUE;
    int ans;
    public int majorityElement(int[] nums) {
        for(int i=0;i<=nums.length-1;i++)
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
            if(count>max)
            {
                max=count;
                ans=nums[i];
            }
        }
        return ans;
    }
}