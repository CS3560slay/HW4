package Scheduler;

import java.rmi.registry.LocateRegistry;
import java.time.LocalDateTime;

public class Task
{
    private String taskName;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String frequency;

    public Task(String eventName, LocalDateTime startTime, LocalDateTime endTime, LocalDateTime startDate, LocalDateTime endDate, String frequency){
        taskName = eventName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.startDate = startDate;
        this.endDate = endDate;
        this.frequency = frequency;
    }
}

