package com.assign.Util;
//
// -------------For Encryption----------------------
// 1. combine text and key and it assign to CombineText
// 2. then create a char array 'strcom' using combineText
// 3. then add 10 all char value one by one
// 4. then create a char array 'str' using key
// 5. then add 10 all char value one by one
// 6. addition char1 and char2, assign to chiphertext
// 7. return chipherText



public class MainCombine {
    public static String encrypt(String text, String key) {
        String char1 = null;
        String char2 = null;
        String cipherText;
        String CombineText = text+key;
        char[] str = key.toCharArray();
        char[] strcom = CombineText.toCharArray();

        for (char c: strcom
        ) {
            c += 10;
            char1 += c;
        }

        for (char c1: str
        ) {
            c1 += 10;
            char2 += c1;
        }
        cipherText = char1+char2;
        return cipherText;
    }

    public static String decrypt(String cipherText, String key) {
        String cip1 = null;
        String cip2 = null;
        String text;
        char[] str = key.toCharArray();
        char[] strchipher = cipherText.toCharArray();
        for (char c1: str
        ) {
            c1 -= 10;
            cip2 += c1;
        }
        for (char c: strchipher
        ) {
            c -= 5;
            cip1 += c;
        }
        text = cip2+cip1;
        return text;
    }
}
