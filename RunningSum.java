import java.util.Arrays;

public class RunningSum {
	public static void main(String[] args) {
		int[] a = {3,1,2,10,1};
		System.err.println(Arrays.toString(runningsum(a)));
 	}

	public static int[] runningsum(int[] nums){
		  int[] ans = new int[nums.length];
        int a = 0;
        for(int i=0;i<nums.length;i++){
            int c = a+nums[i];
            ans[i]=c;
            a=c;
        }
        return ans;
	}
}
