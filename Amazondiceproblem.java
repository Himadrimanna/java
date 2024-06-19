import java.util.ArrayList;

public class Amazondiceproblem {
	public static void main(String[] args) {
		dice("", 4);
		System.out.println(diceret("", 4));

	}
	// direct output

	static void dice(String p, int target){
		if(target == 0){
			System.out.println(p);
			return;
		}

		for(int i = 1; i <= 6 && i <= target ; i++){
			dice( p+i, target-i);
		}
	}

	//array list
	static ArrayList<String> diceret(String p, int target){
		if(target == 0){
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}

		ArrayList<String> ans = new ArrayList<>();
		for(int i = 1; i <= 6 && i <= target ; i++){
		ans.addAll(diceret( p+i, target-i));
		}
		return ans;
	}

}
