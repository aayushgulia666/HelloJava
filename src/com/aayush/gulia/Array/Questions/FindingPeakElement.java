package com.aayush.gulia.Array.Questions;

/**
 * This class finds a peak element in an array using binary search.
 * @since 01/10/2022
 */
public class FindingPeakElement {
    /**
     * Returns peak element if exist.
     * @param a array of elements
     * @return index of peak element.
     */

    public static int findPeakElement(int[] a){
        int low = 0;
        int high = a.length-1;
        int mid;

        while (low <= high){
            mid = low + ((high - low) / 2);

            if (mid > 0 && mid < a.length-1){
                if (a[mid] > a[mid - 1] && a[mid] > a[mid + 1]){
                    return mid;
                }

                else if(a[mid + 1] > a[mid]){
                    low = mid + 1;
                }

                else{
                    high = mid - 1;
                }
            }

            else if (mid == 0){
                if (a[mid] > a[mid + 1]){
                    return mid;
                }
            }

            else if (mid == a.length - 1){
                if (a[mid] > a[a.length - 2]){
                    return mid;
                }
            }
        }
        return -1;
    }
}
