class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        int max=0;
        for(int i=0;i<k;i++)
        {
           max+=arr[i];
        }
        int sum=max;
        for(int i=k;i<n;i++)
        {
            sum=sum+arr[i]-arr[i-k];
            max=Math.max(max,sum);
        }
        return max;
    }
}