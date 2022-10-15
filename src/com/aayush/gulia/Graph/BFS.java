package com.aayush.gulia.Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Aayush Gulia <aayushgulia07@outlook.com>
 * @since 15/10/2022
 *
 * This class implements Breadth First Search.
 */

public class BFS {
    static int[] visited = new int[8];
    static Queue<Integer> queue = new LinkedList<>();
    static int[][] matrix;
    static int n; // number of vertices.

    public static void bFS(int i){
        int u;
        System.out.println(i + " ");
        visited[i] = 1;
        queue.add(i);

        while (!queue.isEmpty()){
            u = queue.remove();

            for (int v=1; v<=n; v++){

                if (matrix[u][v] == 1 && visited[v] == 0){
                    System.out.println(v);
                    visited[v] = 1;
                    queue.add(v);
                }
            }
        }
    }

    public static void main(String[] args) {
        initializeMatrix();
        displayMatrix();
        System.out.println("BFS : ");
        bFS(1);
    }

    public static void displayMatrix(){
        System.out.println("   0 1 2 3 4 5 6 7");
        System.out.println("   ---------------");
        for (int i=0; i<matrix.length; i++){
            System.out.print(i + " |");
            for (int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void initializeMatrix(){
        Arrays.fill(visited, 0); // fill 0 in visited array.
        n = 7;
        matrix = new int[8][8];

        matrix[0][0] = 0;
        matrix[0][1] = 0;
        matrix[0][2] = 0;
        matrix[0][3] = 0;
        matrix[0][4] = 0;
        matrix[0][5] = 0;
        matrix[0][6] = 0;
        matrix[0][7] = 0;

        matrix[1][0] = 0;
        matrix[1][1] = 0;
        matrix[1][2] = 1;
        matrix[1][3] = 1;
        matrix[1][4] = 1;
        matrix[1][5] = 0;
        matrix[1][6] = 0;
        matrix[1][7] = 0;

        matrix[2][0] = 0;
        matrix[2][1] = 1;
        matrix[2][2] = 0;
        matrix[2][3] = 1;
        matrix[2][4] = 0;
        matrix[2][5] = 0;
        matrix[2][6] = 0;
        matrix[2][7] = 0;

        matrix[3][0] = 0;
        matrix[3][1] = 1;
        matrix[3][2] = 1;
        matrix[3][3] = 0;
        matrix[3][4] = 1;
        matrix[3][5] = 1;
        matrix[3][6] = 0;
        matrix[3][7] = 0;

        matrix[4][0] = 0;
        matrix[4][1] = 1;
        matrix[4][2] = 0;
        matrix[4][3] = 1;
        matrix[4][4] = 0;
        matrix[4][5] = 1;
        matrix[4][6] = 0;
        matrix[4][7] = 0;


        matrix[5][0] = 0;
        matrix[5][1] = 0;
        matrix[5][2] = 0;
        matrix[5][3] = 1;
        matrix[5][4] = 1;
        matrix[5][5] = 0;
        matrix[5][6] = 1;
        matrix[5][7] = 1;

        matrix[6][0] = 0;
        matrix[6][1] = 0;
        matrix[6][2] = 0;
        matrix[6][3] = 0;
        matrix[6][4] = 0;
        matrix[6][5] = 1;
        matrix[6][6] = 0;
        matrix[6][7] = 0;

        matrix[7][0] = 0;
        matrix[7][1] = 0;
        matrix[7][2] = 0;
        matrix[7][3] = 0;
        matrix[7][4] = 0;
        matrix[7][5] = 1;
        matrix[7][6] = 0;
        matrix[7][7] = 0;
    }
}
