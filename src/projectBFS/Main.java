package projectBFS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by slava on 10.11.2016.
 */

public class Main {
    public static void main(String[] args)  {
        int [][]matrix = new int[][]{
                {0, 1, 1, 0,0},
                {1, 0, 0, 1,0},
                {1, 0, 0, 0,1},
                {0, 1, 0, 0,1},
                {0, 0, 1, 1,0},
                {0, 0, 1, 1,0}
        };
        System.out.println(matrix.length);
    }

}