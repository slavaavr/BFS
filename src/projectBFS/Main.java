package projectBFS;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by slava on 10.11.2016.
 */

public class Main {
    public static void main(String[] args)  {
        int [][]matrix = new int[][]{
                {0,0,1,1},
                {1,2,0,1},
                {1,2,0,0},
                {0,1,0,0},
                {0,1,0,0}
        };
        NewBfs bfs = new NewBfs();
        bfs.setMatrix(matrix);
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
//        System.out.println(bfs.run(1,2, TypeOutput.PRINTALLROUTES));


    }

}