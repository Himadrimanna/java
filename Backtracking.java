import java.util.Arrays;

public class Backtracking {
	public static void main(String[] args) {
		boolean[][] board = {{true,true,true},{true,true,true},{true,true,true}};
		int[][] path = new int[board.length][board[0].length];
		pathbacktrackingprint("", 0, 0, board, path, 1);
		pathbacktracking("", 0, 0, board);
	}
	static void pathbacktracking(String p , int r , int c , boolean [][] maze){
		if(r == maze.length-1 && c == maze[0].length-1){
			System.out.println(p);
			return;
		}
		if(!maze[r][c]){
			return;
		}
		maze[r][c] = false;
		if(r < maze.length-1){
			pathbacktracking(p+'D', r + 1, c , maze);
		}

		if(c < maze[0].length-1){
			pathbacktracking(p+'R', r, c+1, maze);
		}

		if(r>0){
			pathbacktracking(p+'U', r-1, c, maze);
		}

		if(c>0){
			pathbacktracking(p+'L', r, c-1, maze);
		}

		maze[r][c] = true;
	}

	static void pathbacktrackingprint(String p , int r , int c , boolean [][] maze, int[][] path, int step){
		if(r == maze.length-1 && c == maze[0].length-1){
			path[r][c] = step;
			for(int[] nums : path){
				System.out.println(Arrays.toString(nums));
			}
			System.out.println(p);
			System.out.println();
			return;
		}
		if(!maze[r][c]){
			return;
		}
		maze[r][c] = false;
		path[r][c] = step;
		if(r < maze.length-1){
			pathbacktrackingprint(p+'D', r + 1, c , maze, path, step+1);
		}

		if(c < maze[0].length-1){
			pathbacktrackingprint(p+'R', r, c+1, maze, path, step+1);
		}

		if(r>0){
			pathbacktrackingprint(p+'U', r-1, c, maze, path, step+1);
		}

		if(c>0){
			pathbacktrackingprint(p+'L', r, c-1, maze, path, step+1);
		}

		maze[r][c] = true;
		path[r][c] = 0;
	}

}
