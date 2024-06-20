import java.util.ArrayList;

public class Mazediagonal {
	public static void main(String[] args) {
		possiblepath("", 3, 3);
		System.out.println(possiblepathret("", 3, 3));
	}

	 static void possiblepath(String p , int r, int c){
		if(r==1 && c==1){
			System.out.println(p);
			return;
		}
		if(r>1 && c>1 ){
			possiblepath(p+"D", r -1, c-1);
		}
		if(r>1){
			possiblepath(p+'V', r-1, c);
		}

		if(c>1){
			possiblepath(p+'H', r, c-1);
		}
	 }

	   static ArrayList<String> possiblepathret(String p , int r, int c){
		if(r==1 && c==1){
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		ArrayList<String> ans = new ArrayList<>();
		if(r>1 && c>1 ){
			ans.addAll(possiblepathret(p+"D", r -1, c-1));
		}
		if(r>1){
		 ans.addAll(possiblepathret(p+'V', r-1, c));
		}
		if(c>1){
		ans.addAll(possiblepathret(p+'H', r, c-1))	;
		}
		return ans;
	 }

}
