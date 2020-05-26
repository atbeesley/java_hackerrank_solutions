// Input Format

// Read some unknown n lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

// Output Format

// For each line, print the line number, followed by a single space, and then the line content received as input.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        for(int i=1;scan.hasNext()==true;i++){
            System.out.println(i+" "+scan.nextLine());
        }
    }
}
