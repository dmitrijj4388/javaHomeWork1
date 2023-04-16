package org.example.task1;

/*
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.


 */
public class Main1 {
    public static void main(String[] args) {

        String s = "a good   example";
        System.out.println(s);
        String[] data = s.split(" ");
        String result = new String();
        for (int i = 0; i < data.length/2; i++) {
            String temp = data[i];
            data[i] = data[data.length-1-i];
            data[data.length-1-i] = temp;

        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] != ""){
                result += data[i].toString() + " ";
            }
        }
        System.out.println(result);


    }
}