// Remove String Apple

public class Substringremovestring {
	public static void main(String[] args) {
		System.out.println(skipApple("bdccappleddc"));
		System.out.println(skipAppnotApple("bdccappleddc"));
	}
	static String skipApple(String up){
		if(up.isEmpty()){
			return "";
		}
		if(up.startsWith("apple")){
			return skipApple(up.substring(5));
		}
		else{
			return up.charAt(0) + skipApple(up.substring(1));
		}
	}

	// skip app if the string is not apple
	static String skipAppnotApple(String up){
		if(up.isEmpty()){
			return "";
		}
		if(up.startsWith("app") && !up.startsWith("apple")){
			return skipAppnotApple(up.substring(3));
		}
		else{
			return up.charAt(0) + skipAppnotApple(up.substring(1));
		}
	}
}
