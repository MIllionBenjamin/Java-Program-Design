package s;

import java.util.*;
import java.io.*;

public class question2
{
    static void reverseEachWordOfString(String inputString)
    {
        String[] words = inputString.split(" ");         
        String reverseString = "";         
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];             
            String reverseWord = "";             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
            reverseString = reverseString + reverseWord + " ";
        }               
        System.out.println(reverseString);
    }
     
    public static void main(String[] args) 
    {
    	System.out.println("input:");
    	Scanner sc = new Scanner(System.in);
    	String line = sc.nextLine();
    	System.out.println("output:");
    	reverseEachWordOfString(line);
    }
}