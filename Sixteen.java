package com.random.kafka;

import java.math.BigInteger;

interface Sequence<T> {
    boolean hasNext();
    T next();
}


public class Sixteen implements Sequence<BigInteger> {
    private BigInteger i = BigInteger.valueOf(0);

    public boolean hasNext() {
        return true;
    }

    public BigInteger next() {
        i = i.add(BigInteger.valueOf(1));
        return i.multiply(i);
    }

    public static void main(String[] args) {
        Sixteen squareSequence = new Sixteen();

        for (int i = 0; i < 100; i++)
            System.out.println(squareSequence.next());
    }
}

