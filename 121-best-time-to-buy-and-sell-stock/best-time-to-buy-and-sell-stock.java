class Solution {
    public int maxProfit(int[] prices) {
        // int max=Integer.MIN_VALUE;
        // int min=Integer.MAX_VALUE;
        // for(int i=0;i<prices.length;i++)
        // {
        //     for(int j=i+1;j<prices.length;j++)
        //     {
        //         int profit=prices[j]-prices[i];
        //         max=Math.max(profit,max);

        //     }
        // }
        // return max;
        int max=0;
        int cp=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            int sp=prices[i];
            cp=Math.min(cp,sp);
            int profit=sp-cp;
            max=Math.max(profit,max);
        }
        return max;
    }
}