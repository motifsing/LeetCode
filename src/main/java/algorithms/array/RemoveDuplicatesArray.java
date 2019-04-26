package algorithms.array;


public class RemoveDuplicatesArray {
    public int removeDuplicates(int[] nums){
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++){
            if (nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicatesArray rd = new RemoveDuplicatesArray();
        int[] nums = {1,1,2,3,3,4,5,6,6,6,7};
        System.out.println(rd.removeDuplicates(nums));
    }
}
