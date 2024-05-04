// if arraylist is not pass as a parameter
import java.util.ArrayList;

public class Arraylistsearch2 {
	public static void main(String[] args) {
		int[] arr = {1,3,4,5,6,5,8};
		System.out.println(findAllIndex(arr, 5, 0));
	}

	static ArrayList<Integer> findAllIndex(int[] arr, int target, int index){
		ArrayList<Integer> list = new ArrayList<>();
		if(index == arr.length){
			return list;
		}
		if(arr[index] == target){
			list.add(index);
		}
		ArrayList<Integer> ansofBelowcalls = findAllIndex(arr, target, index+1);
		list.addAll(ansofBelowcalls);
		return list;
	}

}
