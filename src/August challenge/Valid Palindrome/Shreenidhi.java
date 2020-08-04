package com.company;

import java.util.Arrays;

public class Solution {


    public boolean isPalindrome(String s) {

        String result = s.replaceAll("[^A-Za-z0-9]","");
        char [] ch = result.toCharArray();
        char[] ReverseArray = new char[result.length()];
        System.out.println( result);
        int n = result.length()-1;

        for( int i=n; i>=0; i-- ) {
            ReverseArray[n-i] = ch[i];
        }
        System.out.println( ReverseArray);

        return (Arrays.toString(ReverseArray).equalsIgnoreCase(Arrays.toString(ch))) || (s.length() == 0);
    }
    }

