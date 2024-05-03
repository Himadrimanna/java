import java.util.ArrayList;

public class Arraylistsearch {
	public static void main(String[] args) {
		int[] arr = {1,3,4,5,6,5,7};
		findallIndex(arr, 5, 0);
		System.out.println(list);
		System.out.println(findAllindex(arr, 5, 0, new ArrayList<>()));

	}

	static ArrayList<Integer> list =new ArrayList<>();
	static void findallIndex(int[] arr, int target, int index){
		if(index == arr.length){
			return;
		}
		if(arr[index]==target){
			list.add(index);
		}
		findallIndex(arr, target, index+1);
	}

// arraylist in the function call
	static ArrayList<Integer> findAllindex(int[] arr, int target, int index, ArrayList<Integer> List){
		if(index == arr.length){
			return List;
		}
		if(arr[index]==target){
			List.add(index);
		}
		return findAllindex(arr, target, index+1, List);
	}
}
