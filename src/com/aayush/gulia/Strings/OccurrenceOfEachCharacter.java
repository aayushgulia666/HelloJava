package com.aayush.gulia.Strings;

import java.util.HashMap;

public class OccurrenceOfEachCharacter {
    public static void main(String[] args) {
        String str = new String("Hello World!");
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i=0; i<chars.length; i++){
            if (chars[i] == ' ') continue;

            if (map.containsKey(chars[i])){
                int val = map.get(chars[i]);
                val++;
                map.put(chars[i], val);
                continue;
            }
            map.put(chars[i], 1);
        }

        System.out.println(map);
    }
}
