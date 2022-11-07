package com.aayush.gulia.Strings;

public class MaxWordsInASentence {
    public static void main(String[] args) {
        int a = 0;
        String[] strings = {"Hello, how are you ?", "My name is Anshul Gulia.", "v"};
        for (int i=0; i<strings.length; i++){
            for (int j=0; j<strings[i].length(); j++){
                if (strings[i].charAt(j) == 'a'){
                    a++;
                }
            }
        }

        System.out.println(maxWords(strings));
    }

    private static int maxWords(String[] sentences){
        int max_words = Integer.MIN_VALUE;
        int words = 0;

        for(int i=0; i<sentences.length; i++){
            for(int j=0; j<sentences[i].length(); j++){
                if(sentences[i].charAt(j) == ' '){
                    words++;
                }
            }
            if (sentences[i].length() != 0){
                words++;
            }

            if(words > max_words){
                max_words = words;
            }
            System.out.println(words);

            words = 0;
        }

        return max_words;
    }
}
