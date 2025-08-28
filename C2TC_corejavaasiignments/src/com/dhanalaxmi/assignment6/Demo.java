package com.dhanalaxmi.assignment6;

import java.time.LocalTime;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        TaskScheduler scheduler = new TaskScheduler();

        // Schedule three tasks using lambdas
        scheduler.scheduleTask(
                () -> System.out.println("[1s Task] Tick at " + LocalTime.now()),
                1
        );

        scheduler.scheduleTask(
                () -> System.out.println("[3s Task] Drink water reminder 💧"),
                3
        );

        scheduler.scheduleTask(
                () -> {
                    long sum = 0;
                    for (int i = 1; i <= 10000; i++) sum += i;
                    System.out.println("[5s Task] Sum computed: " + sum);
                },
                5
        );

        // Run tasks for 15 seconds
        Thread.sleep(15_000);

        System.out.println("Shutting down scheduler...");
        scheduler.shutdown();
    }
}

