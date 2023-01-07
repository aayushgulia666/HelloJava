package com.aayush.gulia.Strings.Questions;

public class DefangingAnIPAddress {
    public static void main(String[] args) {
        String s = "12.123.76.90.";
        System.out.println(defangedIpAddress(s));
    }

    static String defangedIpAddress(String s){
        return s.replaceAll("\\.", "[.]");
    }
}
