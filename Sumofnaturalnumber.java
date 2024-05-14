/**
 * Sumofnaturalnumber
 */
public class Sumofnaturalnumber {
	public static void main(String[] args) {
		int num = 5;
		System.out.println(sum(num));
	}

	public static int sum(int n){
		if(n<1){
			return n;
	}
	return n + sum(n-1);
	}
}