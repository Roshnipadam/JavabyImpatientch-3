package com.random.kafka;


public class Thirteen implements Runnable {
    private int id;

    public Thirteen(int id) {
        this.id = id;
    }

    public void run() {
        System.out.println(id);
    }

    public static Runnable joinTasks(Runnable[] tasks) {
        return () -> {
            for (Runnable task : tasks)
                new Thread(task).start();
        };
    }

    public static void main(String[] args) {
        Thirteen[] tasks = new Thirteen[10];
        for (int i = 0; i < tasks.length; i++)
            tasks[i] = new Thirteen(i + 1);

        new Thread(joinTasks(tasks)).start();
    }
}