// searching using recursion

public class Search {
	public static void main(String[] args) {
		int[] arr = {1,3,7,8,0};
		System.out.println(search(arr,4,0));
		System.out.println(searchbol(arr, 4, 0));
	}

	static int search(int[] arr, int target, int index){
		if(index == arr.length){
			return -1;
		}
		if (arr[index] == target){
			return index;
		}
		else{
			return search(arr, target, index + 1);
		}
	}

	static boolean searchbol(int[] arr, int target, int index){
		if(index == arr.length){
			return false;
		}
		return arr[index] == target || searchbol(arr, target, index +1);
	}
}


