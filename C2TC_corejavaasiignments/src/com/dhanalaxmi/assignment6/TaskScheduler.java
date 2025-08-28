package com.dhanalaxmi.assignment6;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class TaskScheduler {

    private final ScheduledExecutorService executor;
    private final List<ScheduledFuture<?>> scheduledTasks = new CopyOnWriteArrayList<>();

    public TaskScheduler(int poolSize) {
        this.executor = Executors.newScheduledThreadPool(poolSize);
    }

    public TaskScheduler() {
        this(Runtime.getRuntime().availableProcessors());
    }

    /**
     * Schedule a task to run at a fixed interval (in seconds).
     */
    public ScheduledFuture<?> scheduleTask(Task task, int intervalSeconds) {
        if (intervalSeconds <= 0) {
            throw new IllegalArgumentException("Interval must be > 0 seconds");
        }
        ScheduledFuture<?> future = executor.scheduleAtFixedRate(
                task::execute,    // using lambda method reference
                0,                // no initial delay
                intervalSeconds,
                TimeUnit.SECONDS
        );
        scheduledTasks.add(future);
        return future;
    }

    /** Cancel one specific task */
    public void cancelTask(ScheduledFuture<?> future) {
        if (future != null) {
            future.cancel(true);
            scheduledTasks.remove(future);
        }
    }

    /** Stop all tasks and shutdown executor */
    public void shutdown() {
        for (ScheduledFuture<?> f : scheduledTasks) {
            f.cancel(true);
        }
        scheduledTasks.clear();
        executor.shutdownNow();
    }
}
