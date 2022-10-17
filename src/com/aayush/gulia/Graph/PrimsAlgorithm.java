package com.aayush.gulia.Graph;

/**
 * This class implements Prims algorithm.
 * @author Aayush Gulia <aayushgulia07@outlook.com>
 * @since 17/10/2022
 */

public class PrimsAlgorithm {
    private static int[][] cost;
    static final int I = Integer.MAX_VALUE; // behaves as infinity. (no edge)
    static final int n = 7; // no. of vertices in graph.

    static int[] near = {I,I,I,I,I,I,I,I};
    static int[][] spanningTree = new int[2][6];

    private static void primsAlgorithm(){
        int i,j,k=0,u=0,v=0,min=Integer.MAX_VALUE;

        // find the minimum cost edge
        for (i=1; i<=n; i++){
            for (j=i; j<=n; j++){
                if (cost[i][j] < min){
                    min=cost[i][j];
                    u=i;
                    v=j;
                }
            }
        }

        //update tree and near array.
        spanningTree[0][0] = u;
        spanningTree[1][0] = v;

        near[u] = 0;
        near[v] = 0;

        // update near array
        for (i=1; i<=n; i++){
            if (near[i] != 0){
                if (cost[i][u] < cost[i][v]){
                    near[i] = u;
                }
                else
                {
                    near[i] = v;
                }
            }
        }



        for (i=1; i<n-1; i++){
            min = I;

            // find min in near array.
            for (j=1; j<=n; j++){
                if (near[j] != 0){
                    if (cost[j][near[j]] < min){
                        min = cost[j][near[j]];
                        k=j;
                    }
                }
            }

            // update MST
            spanningTree[0][i] = k;
            spanningTree[1][i] = near[k];
            near[k] = 0;

            // update near array
            for (j=1; j<=n; j++){
                if (near[j] != 0){
                    if (cost[j][k] < cost[j][near[j]]){
                        near[j] = k;
                    }
                }
            }
        }
    }

    /**
     * Prints the Minimum spanning tree with their corresponding weights.
     */

    private static void printMST(){
        System.out.println("Edge \tWeight");
        for (int i=0; i<n-1; i++){
            System.out.println(spanningTree[0][i] + " - " + spanningTree[1][i] + "\t" + cost[spanningTree[0][i]][spanningTree[1][i]]);
        }
    }

    /**
     * Initializes the matrix. This method must be called before running primsAlgorithm.
     */
    private static void initializeMatrix(){
        cost = new int[][]{
                {I, I, I, I, I, I, I, I},
                {I, I, 25, I, I, I, 5, I},
                {I, 25, I, 12, I, I, I, 10},
                {I, I, 12, I, 8, I, I, I},
                {I, I, I, 8, I, 16, I, 14},
                {I, I, I, I, 16, I, 20, 18},
                {I, 5, I, I, I, 20, I, I},
                {I, I, 10, I, 14, 18, I, I}
        };
    }

    public static void main(String[] args) {
        initializeMatrix();
        primsAlgorithm();
        printMST();
    }
}
