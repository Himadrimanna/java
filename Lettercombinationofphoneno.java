import java.util.ArrayList;

public class Lettercombinationofphoneno {
	public static void main(String[] args) {
		lettercombinationofphoneno("", "12");
		System.out.println(lettercombinationofphonenoret("", "12"));
	}

	//direct printing
	static void lettercombinationofphoneno(String p , String up){
		if(up.isEmpty()){
			System.out.println(p);
			return;
		}

		int digit = up.charAt(0) - '0';
		for(int i = (digit-1)*3 ; i < digit*3 ; i++){
			char ch = (char)('a'+i);
			lettercombinationofphoneno(p+ch, up.substring(1));
		}
	}

	// Return arraylist
	static ArrayList<String> lettercombinationofphonenoret(String p , String up){
		if(up.isEmpty()){
			 ArrayList<String> list = new ArrayList<>();
		list.add(p);
		return list;
		}

		int digit = up.charAt(0) - '0';
		 ArrayList<String> ans = new ArrayList<>();
		for(int i = (digit-1)*3 ; i < digit*3 ; i++){
			char ch = (char)('a'+i);
		ans.addAll(lettercombinationofphonenoret(p+ch, up.substring(1)))	;
		}
		return ans;
	}

}
