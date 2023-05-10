package Scheduler;

import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
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
    public boolean checkAvailability(String date, double startTime, double duration)
    {
        boolean isAvailable = true;

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

    /** Allows the user to add a new task to his/her schedule.
     * @param newTask  A task that will be added to the user's schedule.
     * @return true if the new task was successfully added to the schedule, false otherwise.
     */
    public boolean addTask(String eventName, LocalDateTime startTime, LocalDateTime endTime, LocalDateTime startDate, LocalDateTime endDate, String frequency)
    {

        Task event = new Task(eventName, startTime, endTime, startDate, endDate, frequency);
        taskList.add(event);
        return true;

    }

    /** Allows the user to delete a task in his/her schedule.
     * @param taskName  A task that will be deleted from the user's schedule.
     * @return true if the task was successfully removed from the schedule, false otherwise.
     */
    public boolean deleteTask(String taskName)
    {
        return true;
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
    public static void printDailySchedule()
    {

    }

    /** Displays the user's schedule for the week.
     */
    public static void printWeeklySchedule()
    {

    }

    /** Displays the user's schedule for the month.
     */
    public static void printMonthlySchedule()
    {

    }
}
