package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.math.BigInteger;
// Thuật toán Russian Peasant Multiplication em search StackOverflow
public class Main {
    static BigInteger nhan(long a, long b) {
        boolean negative = (a < 0) != (b < 0);

        BigInteger x = BigInteger.valueOf(a).abs();
        BigInteger y = BigInteger.valueOf(b).abs();
        BigInteger result = BigInteger.ZERO;

        while (y.signum() > 0) {
            if (y.testBit(0)) {
                result = result.add(x);
            }

            x = x.shiftLeft(1);
            y = y.shiftRight(1);
        }

        return negative ? result.negate() : result;
    }

    public static void main(String[] args) {
        System.out.println(nhan(2, 3));    // 6
        System.out.println(nhan(-2, 3));   // -6
        System.out.println(nhan(-2, -3));  // 6
        System.out.println(nhan(2, -3));   // -6
    }
}
