import java.util.*;

public class Linear_search {
	public static void main(String[] args) {
	// 	try(Scanner sc = new Scanner(System.in)){

	// 		int[] nums ={12, 2, 3, 45, 19, 7, 56, 34, 1, 8, 9, 65, 64, 32, 23, 6};
	// 	    System.out.print("Enter the target: ");
    //         int target = sc.nextInt();
	// 		int ans = linearSearch(nums, target);
	// 		System.out.println(ans);
	// 	}
	// }

	// static int linearSearch(int[] arr,int target){
	// 	if (arr.length == 0){
	// 		return -1;
	// 	}
	// 	for (int index =0; index < arr.length;index++){
	// 		if (arr[index]==target){
    //             return index;
	// 		}
	// 	}
	// 	return -1;
	// }


	// ***************** 2d arrays searching *************//
	// try(Scanner sc = new Scanner(System.in)){

	// 		int[][] nums ={{12, 2, 3, 45},
	// 		              {19, 7, 56 },
	// 					  {34, 1, 8, 9, 65},
	// 					  {64, 32, 23, 6}};
	// 	    System.out.print("Enter the target: ");
    //         int target = sc.nextInt();
	// 		int[] ans = linearSearch(nums, target);
	// 		System.out.println(Arrays.toString(ans));
	// 	}
	// }

	// static int[] linearSearch(int[][] arr,int target){

	// 	for (int row =0; row < arr.length;row++){
	// 		for(int col =0;col<arr[row].length;col++){
	// 			if(arr[row][col] == target){
	// 				return new int[]{row,col};
	// 			}
	// 		}
	// 	}
	// 	return new int[]{-1,-1};
	// }

	try(Scanner sc = new Scanner(System.in)){

			int[][] nums ={{12, 2, 3, 45},
			              {19, 7, 56 },
						  {34, 1, 8, 9, 65},
						  {64, 32, 23, 6}};

			int ans = linearSearch(nums);
			System.out.println(ans);
		}
	}

	static int linearSearch(int[][] arr){
       int max = Integer.MIN_VALUE;

		for (int row =0; row < arr.length;row++){
			for(int col =0;col<arr[row].length;col++){
				if(arr[row][col] > max){
					max = arr[row][col];
				}
				}
			}
			return max;

		}

	}

