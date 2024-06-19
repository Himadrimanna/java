//Maze problem

import java.util.ArrayList;

/**
 *    | 0|  |  |
 *    |  |  |  |
 *    |  |  | t|
 *  a person zero is in a maze of 3x3 matrix find all possible ways and path to reach target t
 *  */

public class Mazeproblem {
	 public static void main(String[] args) {
		System.out.println(pathcount(3, 3));
		possiblepath("", 3, 3);
		System.out.println(possiblepathret("", 3, 3));
	 }

	 // to find possible no of path
	 static int pathcount(int r, int c){
		if(r==1 || c == 1){
			return 1;
		}

		int left = pathcount(r-1, c);
		int right = pathcount(r, c-1);
		return left + right;
	 }

	 // to print all the possible path
	 static void possiblepath(String p , int r, int c){
		if(r==1 && c==1){
			System.out.println(p);
			return;
		}

		if(r>1){
			possiblepath(p+'D', r-1, c);
		}
		if(c>1){
			possiblepath(p+'R', r, c-1);
		}
	 }

	 //  return Arraylist
	   static ArrayList<String> possiblepathret(String p , int r, int c){
		if(r==1 && c==1){
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		ArrayList<String> ans = new ArrayList<>();
		if(r>1){
		 ans.addAll(possiblepathret(p+'D', r-1, c));
		}
		if(c>1){
		ans.addAll(possiblepathret(p+'R', r, c-1))	;
		}
		return ans;
	 }

}
