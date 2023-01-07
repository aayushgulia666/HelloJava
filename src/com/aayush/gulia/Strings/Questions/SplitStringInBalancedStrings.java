package com.aayush.gulia.Strings.Questions;

public class SplitStringInBalancedStrings {
    public static void main(String[] args) {
        String s = "RLRRRLLRLL";
        System.out.println(balancedStringSplit(s));
    }

    /**
     * Returns maximum numbers of balanced strings.
     * @param s String
     * @return integer containing maximum number of balanced strings
     */
    static int balancedStringSplit(String s) {
    int left = 0, right = 0, count = 0;

    for(int i=0; i<s.length(); i++){
        if(s.charAt(i) == 'L'){
            if(right == 0){
                left++;
            }
            else{
                right--;
            }
        }

            else{
                if(left == 0){
                    right++;
            }
            else{
                left--;
            }
        }

            if(left == 0 && right == 0){
                count++;
        }
    }
        return count;
    }
}
