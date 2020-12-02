package Backtracking;

public class RatMazePuzzle {
    public static void main(String[] args) {
        int[][] maze ={{1,1,0},{1,1,1},{1,1,1}};
        int[][] path =new int[maze.length][maze.length];
        int[][] validMoves ={{0,1},{1,0},{-1,0},{0,-1}};
        findPath(maze,path,validMoves);
    }

    public static  void findPath(int matrix[][],int path[][],int [][] moves){



    }
}
