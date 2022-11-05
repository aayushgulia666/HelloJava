package com.aayush.gulia.Array.Questions;

/**
 * @author Aayush Gulia <aayushgulia07@outlook.com>
 * @since 05/11/2022
 * leet code 48
 */
public class RotateImage {
    public static void main(String[] args) {
        int[][] image = {{1,2,3}, {4,5,6}, {7,8,9}};
        rotate(image);
        displayImage(image);
    }

    /**
     * Rotates the image by 90°
     *
     * T:O(n^2)
     * S:O(1)
     * @param matrix input 2D array
     */

    private static void rotate(int[][] matrix){
        // transpose and then reverse.

        for (int i=0; i<matrix.length; i++){
            for (int j=i; j<matrix[0].length; j++){
                int temp;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i=0; i<matrix.length; i++){
            for (int j=0; j< matrix.length/2; j++){
                int temp;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }

    /**
     * Copy the image into a rotated image at 90 degrees.
     * T: O(n^2)
     * S: O(n^2)
     *
     * @param image matrix to be rotated at 90 degrees
     * @return rotated image at 90 degrees
     */

    private static int[][] copyRotatedImage(int[][] image){
        int[][] rotatedImage = new int[image.length][image[0].length];

        for (int j=0, k=0; j<image[0].length; j++, k++){
            for (int i=image.length-1, l=0; i>=0; i--, l++){
                rotatedImage[k][l] = image[i][j];
            }
        }
        return rotatedImage;
    }

    /**
     * Prints the image
     * @param image matrix
     */

    private static void displayImage(int[][] image){
        for (int[] ints : image) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
