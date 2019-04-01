package com.random.kafka;

interface IntSequences {
    boolean hasNext();
    int next();

    public static IntSequences constant(int a) {
        return new IntSequences() {
            public boolean hasNext() { return true; }
            public int next() { return a; }
        };
    }
}

public class Fifth {
    public static void main(String[] args) {
        IntSequences constant = IntSequences.constant(1);

        for(int i = 0; i < 5 && constant.hasNext(); i++)
            System.out.println(constant.next());
    }
}
