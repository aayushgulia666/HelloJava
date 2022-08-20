package String;

/**
 * @author aayush ,
 * @email aayushgulia07@outlook.com ,
 * @dated 20-08-2022 ,
 *
 * ASCII - American Standard Code For Information Exchange
 *
 * In ASCII we have lower case letters from 65-A to 90-Z && 97-a to 122-z
 * we can simply change case of a letter to lower or upper by adding or subtracting 32 to it's ASCII code.
 *
 * ASCII is a subset of Unicode.
 *
 * For more information visit https://unicode.org/standard/WhatIsUnicode.html
 *
 */
public class ASCII {
    public static void main(String[] args) {
        char x = 'A';   // ASCII code is: 65
        char y = 'B';   // ASCII code is: 66

        String str = "My Name is Aayush";  // this is the largest known palindrome.
        char[] chars = str.toCharArray();

        NumberOfVowels(chars);
    }

    static void NumberOfVowels(char[] chars){
        // a,e,i,o,u

        int i;
        int vcount = 0;
        int ccount = 0;

        for (i=0; i<chars.length; i++){

            // If we have a lot of rules, we have to use a lot of conditions.

            if (chars[i] == 'A' || chars[i] == 'E' || chars[i] == 'I' || chars[i] == 'O' || chars[i] == 'U'
            || chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u'){
                vcount++;
            }

            else if((chars[i] >= 65 && chars[i] <= 90) || chars[i] >= 97 && chars[i] <=122){
                ccount++;
            }
        }

        System.out.println("Vowel : " + vcount);
        System.out.println("Consonants : " + ccount);
    }

    static void IsPalindrome(char[] chars){
        int i,j;

        /*
        1) we can check by comparing.
        2) we can check by reversing the array and matching with the original char array.
         */

        for(i=0,j=chars.length-1; i<j; i++,j--){
            if (chars[i] != chars[j]){
                System.out.println("Not Palindrome!");
            }
        }

        System.out.println("Palindrome! ");
    }

    static void ToggleCase(char[] chars){
        int i;
        for (i=0; i<chars.length; i++){
            if (chars[i] >= 65 && chars[i] <=90){
                chars[i]+=32;
            }

            else if(chars[i] >=97 && chars[i] <=122){
                chars[i]-=32;
            }
        }
    }

    static void AllLowerCase(char[] chars){
        int i;

        for (i=0; i<chars.length; i++){

            if (chars[i] >= 65 && chars[i] <= 90){
                chars[i]+=32;
            }
        }
    }

    static void AllUpperCase(char[] chars){
        int i;
        for (i=0; i<chars.length; i++){
            if (chars[i] >= 97 &&  chars[i] <=122){
                chars[i]-=32;
            }
        }
    }

    static void Display(char[] chars){
        for(char x : chars){
            System.out.print(x+ " ");
        }
    }

    static void DisplayInASCII(char[] chars){
        for(char x : chars){
            System.out.print((int) x + " ");
        }
    }
}
