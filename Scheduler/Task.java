package Scheduler;

import java.rmi.registry.LocateRegistry;
import java.time.LocalDateTime;

public class Task
{
    private String taskName;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String frequency;

    public Task(String eventName, LocalDateTime startTime, LocalDateTime endTime, String frequency){
        taskName = eventName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.frequency = frequency;
    }
}

