import java.util.Arrays;

public class PermutationArray {
	public static void main(String[] args) {
		int[] a  = {5,0,1,2,3,4};
		System.out.println(Arrays.toString(buildArray(a)));

	}
	public static int[] buildArray(int[] arr) {
    int[] nums = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        nums[i] = arr[arr[i]];
    }
    return nums;
}

}
