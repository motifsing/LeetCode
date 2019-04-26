package algorithms.array;

public class MaximumSubarray {
    public int maxSubArray1(int[] nums){
        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            int sum = nums[i];
            if(sum > max) max = sum;
            if(i==nums.length-1){
                if(nums[nums.length-1]>max) {
                    max = nums[nums.length - 1];
                }
                return max;
            }
            for(int j=i+1; j<nums.length; j++){
                sum = sum + nums[j];
                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] > 0) nums[i] += nums[i-1];
            if(nums[i] > max) max = nums[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubarray msa = new MaximumSubarray();
        System.out.println(msa.maxSubArray1(nums));
        System.out.println(msa.maxSubArray(nums));
    }
}
