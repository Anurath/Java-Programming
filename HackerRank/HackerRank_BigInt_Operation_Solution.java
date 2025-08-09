import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRank_BigInt_Operation_Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String num1 = sc.next();
        String num2 = sc.next();
        
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        
        
        System.out.println(n1.add(n2));
        System.out.println(n1.multiply(n2));
    }
}