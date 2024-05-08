// leetcode question
// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
// Merge nums1 and nums2 into a single array sorted in non-decreasing order.
// The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

import java.util.Arrays;

public class mergetwosortedarray {
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		merge(nums1, 3,nums2,3);
		System.out.println(Arrays.toString(nums1));
	}
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mix = new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                mix[k] = nums1[i];
                i++;
            }else{
                mix[k] = nums2[j];
                j++;
            }k++;
        }
        while(i<m){
            mix[k] = nums1[i];
            i++;
            k++;
        }
        while(j<n){
            mix[k] = nums2[j];
            j++;
            k++;
        }

        for(int l = 0 ; l<mix.length ; l++){
            nums1[l] = mix[l];
        }

    }

}

// Time complexity O(m+n);
// space complexity O(1);