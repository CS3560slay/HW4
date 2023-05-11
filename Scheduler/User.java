package Scheduler;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
// import java.text.SimpleDateFormat;
// import java.util.Calendar;
// import java.util.Date;
import java.util.Scanner;

public class User
{

    public static void createTask(){
        Scanner scanner = new Scanner(System.in);

        String eventName, input, frequency;
        int yes;
        LocalDateTime startTime;
        LocalDateTime endTime;

        System.out.println("What is the name of your task?");
        eventName = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        System.out.print("Enter a start date and time (yyyy-MM-dd HH:mm): ");
        input = scanner.nextLine();
        startTime = LocalDateTime.parse(input, formatter);

        System.out.print("Enter an end date and time (yyyy-MM-dd HH:mm): ");
        input = scanner.nextLine();
        endTime = LocalDateTime.parse(input, formatter);

        System.out.println("Is this a weekly task?\n(1)Yes\n(2)No\n(3)AntiTask");
        yes = scanner.nextInt();

        if(yes == 1){
            frequency = "Weekly";
            Schedule cal = new Schedule();
            cal.addTask(eventName, startTime, endTime, frequency);
        }else if(yes == 2){
            frequency = "Once";
            Schedule cal = new Schedule();
            cal.addTask(eventName, startTime, endTime, frequency);
        }else if(yes == 3){
            frequency = "Once";
            Schedule cal = new Schedule();
            cal.addAntiTask(eventName, startTime, endTime, frequency);
        }

        // Schedule cal = new Schedule();
        // cal.addTask(eventName, startTime, endTime, frequency);

    }

    public static void createAntiTask(){
        
    }

    public static void deleteTask(){

    }

    public static void editTask(){

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

    /**
     * 
     */
    public static void viewSchedule(){

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

    public static void main(String[] args) throws ParseException
    {
        Scanner scn = new Scanner(System.in);
        int input;
        // boolean test = editTask("Hello");
        // System.out.println(test);

        // SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        // SimpleDateFormat stf = new SimpleDateFormat("HH:mm");
        // Calendar c = Calendar.getInstance();
        // c.setTime(new Date());
        // c.add(Calendar.DATE, 5);
        // String time = "23:55";
        // Date d = stf.parse(time);
        // Calendar cal = Calendar.getInstance();
        // cal.setTime(d);
        // cal.add(Calendar.MINUTE, 10);
        // String newTime = stf.format(cal.getTime());
        // String output = sdf.format(c.getTime());
        // System.out.println(output);
        // System.out.println(newTime);

        System.out.println("Welcome to your Scheduler.\nPlease select a task.");
        do{
            System.out.println("(1)To import a schedule (JSON file)");
            System.out.println("(2)To export your schedule (JSON file)");
            System.out.println("(3)To add an event to your schedule");
            System.out.println("(4)To delete an event to your schedule");
            System.out.println("(5)To edit an event to your schedule");
            System.out.println("(6)To print a daily schedule");
            System.out.println("(7)To print a weekly schedule");
            System.out.println("(8)To print a montly schedule");
            System.out.println("(9)To print your entire schedule");
            System.out.println("(0)Exit\n");
            input = scn.nextInt();

            if(input == 1){

            }else if(input == 2){

            }else if(input == 3){
                createTask();
            }else if(input == 4){
                deleteTask();
            }else if(input == 5){
                editTask();
            }else if(input == 6){
                viewDailySchedule();
            }else if(input == 7){
                viewWeeklySchedule();
            }else if(input == 8){
                viewMonthlySchedule();
            }else if(input == 9){
                viewSchedule();
            }else if(input == 0){
                //do nothing
            }else{
                System.out.println("Error: Please input an integer between 0-9\n\n");
            }

        }while(input != 0);

        System.out.println("\nThank you for using the scheduler!");
    }
}
