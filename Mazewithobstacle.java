public class Mazewithobstacle {
	public static void main(String[] args) {
		 boolean[][] board = {{true,true,true},{true,false,true},{true,true,true}};
		 pathwithobstacle("", 0, 0, board);

	}

	static void pathwithobstacle(String p , int r , int c , boolean [][] maze){
		if(r == maze.length-1 && c == maze[0].length-1){
			System.out.println(p);
			return;
		}
		if(!maze[r][c]){
			return;
		}
		if(r < maze.length-1){
			pathwithobstacle(p+'V', r + 1, c , maze);
		}

		if(c < maze[0].length-1){
			pathwithobstacle(p+'H', r, c+1, maze);
		}
	}
}
