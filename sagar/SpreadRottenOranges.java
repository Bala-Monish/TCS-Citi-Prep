import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {

	public static void main(String[] args) throws IOException {
		int[][] grid = {{1},{2},{1},{1},{1}};
		System.out.println(orangesRotting(grid));
	}
	public static Point getOrange(int[][] grid, int type) {
        Point fresh = null;
        for(int i=0;i<grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == type) {
                    return new Point(i, j);
                }
            }
        }
        return fresh;
    }
    public static List<Point> getAllOfType(int[][] grid, int type) {
        return IntStream.range(0, grid.length)
        		 .mapToObj(i -> IntStream.range(0, grid[0].length)
        				 				 .mapToObj(j -> new Point(i, j))
        				 )
        		 .flatMap(str -> str.filter(p -> grid[p.getX()][p.getY()] == type))
        		 .map(p -> (Point)p).collect(Collectors.toList());
    }

    public static  int orangesRotting(int[][] grid) {
        List<Point> rotten = getAllOfType(grid, 2);
        int min = 0;
        
        LinkedList<Point> queue = new LinkedList<Point>(rotten);
        
        while(queue.size() > 0) {
            boolean converted = false;
            int size = queue.size();
            while(size > 0) {

                size--;
                Point c = queue.pop();
             // TOP
                if(c.getX() > 0 && grid[c.getX() - 1][c.getY()] == 1) {
                    grid[c.getX() - 1][c.getY()] = 2;
                    queue.add(new Point(c.getX() - 1, c.getY()));
                    converted = true;
                }
                // BOTTOM
                if(c.getX() < grid.length - 1 && grid[c.getX() + 1][c.getY()] == 1) {
                    grid[c.getX() + 1][c.getY()] = 2;
                    queue.add(new Point(c.getX() + 1, c.getY()));
                    converted = true;
                }
                // LEFT
                if(c.getY() > 0 && grid[c.getX()][c.getY() - 1] == 1) {
                    grid[c.getX()][c.getY() - 1] = 2;
                    queue.add(new Point(c.getX(), c.getY() - 1));
                    converted = true;
                }
                // RIGHT
                if(c.getY() < grid[c.getX()].length - 1 && grid[c.getX()][c.getY() + 1] == 1) {
                    grid[c.getX()][c.getY() + 1] = 2;
                    queue.add(new Point(c.getX(), c.getY() + 1));
                    converted = true;
                }
            }
            if(converted) min++;
        }
        if(getOrange(grid, 1) != null) return -1;
    
        return min;
    }
}

