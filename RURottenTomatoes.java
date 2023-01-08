/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author:
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/


public class RURottenTomatoes {

    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int[][] grid= new int [x][y];
    
        int r = 2;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                grid[i][j] = Integer.parseInt(args[r]);
                r++;
            }
        }
    
        int max = 0;
        int index = 0;
    
        for (int j = 0; j < y; j++) {
            int sum = 0;
            for(int i = 0; i < x; i++){
                sum += grid[i][j];
            }
            if(sum > max){
                max = sum;
                index = j;
            }
        }
        System.out.println(index);
        }
    }
