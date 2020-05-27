// In this problem, you have to add and multiply huge numbers! 
//
// These numbers are so big that you can't contain them in any ordinary data types like a long integer.
//
// Use the power of Java's BigInteger class and solve this problem.
//
// There will be two lines containing two numbers, a and b.
//
// Output two lines. The first line should contain a + b,
// and the second line should contain a * b. Don't print any leading zeros.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        java.math.BigInteger a = new BigInteger(scan.next());
        java.math.BigInteger b = new BigInteger(scan.next());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
