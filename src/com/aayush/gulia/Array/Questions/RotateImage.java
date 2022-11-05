package com.aayush.gulia.Array.Questions;

/**
 * @author Aayush Gulia <aayushgulia07@outlook.com>
 * leet code 48
 */
public class RotateImage {
    public static void main(String[] args) {
        int[][] image = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int[][] rotatedImage = copyRotatedImage(image);
        displayImage(rotatedImage);

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
