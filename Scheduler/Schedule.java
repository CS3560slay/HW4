package Scheduler;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Schedule
{
    private ArrayList taskList;

    /** Allows the user to check availability in his/her schedule.
     * @param date      The date to check for availability.
     * @param startTime The start time to check for availability.
     * @param duration  The duration to check for availability.
     */
    public boolean checkAvailability(String date, double startTime, double duration)
    {
        boolean isAvailable = true;

        return isAvailable;
    }

    /** Allows the user to check if he/she is attempting to create a task
     *  that overlaps an existing task.
     * @param task  A task that may already exist within the user's schedule.
     */
    public boolean checkOverlap(Task task)
    {
        return false;
    }



}
