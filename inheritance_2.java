// Write the following code in your editor below:
//
// A class named Arithmetic with a method named add that takes 2 integers as parameters
// and returns an integer denoting their sum.

// A class named Adder that inherits from a superclass named Arithmetic.

// Your classes should not be be public.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Arithmetic{
    public static int add(int A, int B) {
        int C = A + B;
        return C;
    }
}

class Adder extends Arithmetic{

}

public class Solution{
