// String remove with changingthe original string
public class Substringremove2 {
	public static void main(String[] args) {
		System.out.println(skip2("baccad"));
	}
	static String skip2(String up){
		if(up.isEmpty()){
			return "";
		}
		char ch = up.charAt(0);
		if(ch=='a'){
			return skip2(up.substring(1));
		}else{
			return ch +skip2(up.substring(1));
		}
	}
}
