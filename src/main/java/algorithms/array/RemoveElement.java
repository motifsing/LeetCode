package algorithms.array;

public class RemoveElement {
    public int removeElement(int[] nums, int val){
        int length = nums.length;
        int i = 0;
        while (i < length){
            if(nums[i]==val) {
                if(nums[length-1]!=val){
                    nums[i] = nums[length-1];
                }
                length--;
            }else {
                i++;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,2,3,2};
        RemoveElement re = new RemoveElement();
        re.removeElement(nums, 2);
//        int length = re.removeElement(nums, 2);
//        System.out.println(length);
    }
}
