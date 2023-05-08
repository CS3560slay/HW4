package Scheduler;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Schedule
{

    /** Allows the user to create a new task.
     * @param taskName Name of the task being created
     * @param taskType Type of task being created
     * @return true if task is created successfully, false otherwise.
     */
    public static boolean createTask(String taskName, String taskType)
    {
        boolean created = true;

        //placeholder if-else statement
        if (created)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    /** Allows the user to view a task.
     * @param taskName Name of the task being viewed.
     */
    public static void viewTask(String taskName)
    {

    }

    /** Allows the user to delete a task.
     * @param taskName Name of task being deleted
     * @return verify if task is deleted
     */
    public static boolean deleteTask(String taskName)
    {
        boolean deleted = true;

        if (deleted)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /** Allows the user to edit a task.
     * @param taskName Name of task being editted
     * @return verify if task is editted
     */
    public static boolean editTask(String taskName)
    {
        boolean edited = true;

        if (edited)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     */
    public static void viewDailySchedule()
    {

    }

    public static void main(String[] args) throws ParseException
    {
        boolean test = editTask("Hello");
        System.out.println(test);

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat stf = new SimpleDateFormat("HH:mm");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.DATE, 5);
        String time = "23:55";
        Date d = stf.parse(time);
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.MINUTE, 10);
        String newTime = stf.format(cal.getTime());
        String output = sdf.format(c.getTime());
        System.out.println(output);
        System.out.println(newTime);

    }

}
