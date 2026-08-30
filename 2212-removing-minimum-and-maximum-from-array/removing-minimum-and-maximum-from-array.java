class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int minIndex=0;
        int maxIndex=0;
        for(int k=1;k<n;k++){
            if(nums[k]<nums[minIndex])
            minIndex=k;
            if(nums[k]>nums[maxIndex])
            maxIndex=k;
        }
        if(minIndex>maxIndex){
            int temp=minIndex;
            minIndex=maxIndex;
            maxIndex=temp;
        }
        int front =maxIndex+1;
        int back=n-minIndex;
        int both=minIndex+1+n-maxIndex;
        return Math.min(front, Math.min(back,both));
    }
}