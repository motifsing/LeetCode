package algorithms.array;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        if(target > nums[nums.length-1]) {
            index = nums.length;
            return index;
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == target || target <= nums[i]){
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int target = 3;
        SearchInsertPosition sip = new SearchInsertPosition();
        System.out.println(sip.searchInsert(nums, target));
    }
}
