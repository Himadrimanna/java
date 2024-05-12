public class Binarysearchrecurrsion {
	public static void main(String[] args) {
		int[] nums ={-1,0,3,5,9,12};
		System.out.println(search(nums,2));
	}
	 public static int search(int[] nums, int target) {
        int ans = binaryrecurssion(nums,target,0,nums.length-1);
        return ans;
    }
    private static int binaryrecurssion(int[] nums, int target, int s, int e){
        if(s>e){
            return -1;
            }
            int m = s+(e-s)/2;
            if(nums[m]== target){
                return m;
            }
            if(target< nums[m]){
                return binaryrecurssion(nums,target,s,m-1);
            }
            return binaryrecurssion(nums, target, m+1,e);
    }

}
