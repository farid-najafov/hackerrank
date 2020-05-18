package Algorithms;

import java.math.BigInteger;

/**https://www.hackerrank.com/challenges/extra-long-factorials/problem*/

public class ExtraLongFactorials {
    static void extraLongFactorials(int n) {
        BigInteger res = new BigInteger("1");
        for (int i = 2; i <= n; i++)
            res = res.multiply(BigInteger.valueOf(i));
        System.out.println(res);
    }
}
