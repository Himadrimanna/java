/*Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.*/


public class Majoritynumber {
	public static void main(String[] args) {
		int[] arr = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(arr));

	}
	static int majorityElement(int[] nums) {
        int majority = 0;
        for (int i = 0;i<nums.length; i++){
            int count = 0;
            for(int j = i;j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count>nums.length/2){
                majority = nums[i];
            }
        }return majority;
    }

}
