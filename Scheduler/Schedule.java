package Scheduler;

import java.text.ParseException;
import java.time.Duration;
//import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Schedule
{
    private ArrayList<Task> taskList;

    public Schedule(){
        taskList = new ArrayList<Task>();
    }

    /** Allows the user to check availability in his/her schedule.
     * @param date      The date to check for availability.
     * @param startTime The start time to check for availability.
     * @param duration  The duration to check for availability.
     * @return true if there's an availability in the schedule, false otherwise.
     */
    public boolean checkAvailability(LocalDateTime startTime, LocalDateTime endTime)
    {
        boolean isAvailable = true;

        for (int i = 0; i < taskList.size(); i++) {
            LocalDateTime objStartDate = taskList.get(i).getStartDate();
            LocalDateTime objEndDate = taskList.get(i).getEndDate();
            String event = taskList.get(i).getName();

            //if-else can be more optimized to one if statement
            if (objStartDate.isBefore(startTime) && objEndDate.isBefore(endTime)) {
                return false;
            }else if(objStartDate.isAfter(startTime) && objEndDate.isAfter(endTime)){
                return false;
            }
        }

        return isAvailable;
    }

    /** Allows the user to check if he/she is attempting to create a task
     *  that overlaps an existing task.
     * @param task  A task that may already exist within the user's schedule.
     * @return true if there's an overlap in the schedule, false otherwise.
     */
    public boolean checkOverlap(Task task)
    {
        return false;
    }

    /**
     * 
     * @param eventName
     * @param startTime
     * @param endTime
     * @param startDate
     * @param endDate
     * @param frequency
     * @return
     * 
     */
    public boolean addTask(String eventName, LocalDateTime startTime, LocalDateTime endTime, String frequency)
    {
        boolean avail = checkAvailability(startTime, endTime);

        if(avail){
            if (frequency.equals("Weekly")) {
                LocalDateTime currentDateTime = startTime;
    
                LocalTime eventStartTime = startTime.toLocalTime();
                LocalTime eventEndTime = endTime.toLocalTime();
    
                Duration duration = Duration.between(eventStartTime, eventEndTime);
                long hours = duration.toHours();
    
                while (currentDateTime.isBefore(endTime)) {
                    Task event = new Task(eventName, currentDateTime, currentDateTime.plusHours(hours), frequency);
                    taskList.add(event);
                    currentDateTime = currentDateTime.plusWeeks(1);
                }
    
                return true;
    
            } else {
                Task event = new Task(eventName, startTime, endTime, frequency);
                taskList.add(event);
                return true;
            }
        }else{
            return false;
        }

        

    }

    /**
     * 
     * @param eventName
     * @param startTime
     * @param endTime
     * @return
     */
    public boolean deleteTask(String eventName, LocalDateTime startTime, LocalDateTime endTime)
    {
        
        for (int i = 0; i < taskList.size(); i++) {
            LocalDateTime objStartDate = taskList.get(i).getStartDate();
            LocalDateTime objEndDate = taskList.get(i).getEndDate();
            String event = taskList.get(i).getName();
            if (objStartDate.toLocalDate().equals(startTime.toLocalDate()) && objEndDate.toLocalDate().equals(endTime.toLocalDate()) && event.equals(eventName)) {
                taskList.remove(i);
                return true;
            }
        }
        return false;

    }

    /** Allows the user to edit a task in his/her schedule.
     * @param taskName  A task that will be edited from the user's schedule.
     * @return true if the task was successfully edited from the schedule, false otherwise.
     */
    public boolean editTask(String taskName)
    {
        return true;
    }

    /** Displays the user's schedule for the day.
     */
    public static void printDailySchedule(LocalDateTime dayTime)
    {

    }

    /** Displays the user's schedule for the week.
     */
    public static void printWeeklySchedule(LocalDateTime startDate, LocalDateTime endDate)
    {

    }

    /** Displays the user's schedule for the month.
     */
    public static void printMonthlySchedule(LocalDateTime startDate, LocalDateTime endDate)
    {

    }
}
