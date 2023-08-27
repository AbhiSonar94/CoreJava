package com.automation;

import org.testng.annotations.Test;
import java.util.Scanner;
public class ReverseString {

    Scanner in = new Scanner(System.in);
    //reports - test-output
    @Test(priority = 0)
    public void reverseStringInBuiltMethod()
    {
        System.out.println("Reversing input string in reverse using in-built java method");
        System.out.println("Enter the string");
        String input = in.next();
        System.out.println("Entered String : "+input);
        StringBuilder reverseString = new StringBuilder();
        reverseString.append(input);
        reverseString.reverse();
        System.out.println("Reversed String : "+reverseString);
    }
}
