package com.assign.Util;

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
        return cipherText;
    }
}
