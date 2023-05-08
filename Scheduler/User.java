package Scheduler;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class User
{
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
     * @return true if task is successfully deleted, false otherwise.
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
     * @param taskName Name of task being edited
     * @return true if task is successfully edited, false otherwise.
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

    /** Allows the user to view his/her schedule for the day.
     */
    public static void viewDailySchedule()
    {
        // maybe call the printDailySchedule()
    }

    /** Allows the user to view his/her schedule for the week.
     */
    public static void viewWeeklySchedule()
    {
        // maybe call the printWeeklySchedule()
    }

    /** Allows the user to view his/her schedule for the month.
     */
    public static void viewMonthlySchedule()
    {
        // maybe call the printMonthlySchedule()
    }

    /** Allows the user to store the list of tasks to a data file.
     * @param fileName Name of the data file which will store the task list.
     * @return true if task list is successfully stored, false otherwise.
     */
    public static boolean storeTaskList(String fileName)
    {
        boolean stored = true;

        return stored;
    }

    /** Allows the user to read the list of tasks from a data file.
     * @param fileName Name of the data file which will contain the task list.
     * @return true if task list is successfully read, false otherwise.
     */
    public static boolean readTasks(String fileName)
    {
        boolean edited = true;

        return edited;

    }
}
