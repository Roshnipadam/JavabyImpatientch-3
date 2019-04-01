package com.random.kafka;

@FunctionalInterface
interface IntSequencess {
    int next();

    public static IntSequencess constant(int a) { return () -> a; }
}

public class FifthTest {
    public static void main(String[] args) {
        IntSequencess constant = IntSequencess.constant(3);

        for(int i = 0; i < 10; i++)
            System.out.println(constant.next());
    }
}
