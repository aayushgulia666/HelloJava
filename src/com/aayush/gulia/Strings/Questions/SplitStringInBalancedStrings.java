package com.aayush.gulia.Strings.Questions;

public class SplitStringInBalancedStrings {
    public static void main(String[] args) {
        String s = "RLRRRLLRLL";
        System.out.println(balancedString(s));
    }

    static int balancedString(String s){
        int count = 0, balancedStrings = 0;

        for (int i=0; i<s.length(); i++){
            char current = s.charAt(i);

            if (current == 'R'){
                count++;
            }
            if (current == 'L'){
                count--;
            }

            if (count == 0){
                balancedStrings++;
            }
        }
        return balancedStrings;
    }
}
