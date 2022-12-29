import java.util.*;

enum Weekday
{
//enum values
MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

//method to check isWeekdayweekday
private static boolean isWeekday(Weekday day)
{
if (day != SUNDAY && day != SATURDAY)
{
return true;
}
return false;
}

//method to check isHoliday
private static boolean isHoliday(Weekday day)
{
if (day == SUNDAY || day == SATURDAY)
{
return true;
}
return false;
}

//to check isWeekday or isHoliday and print the message accordingly
public static void testDay(Weekday day)
{
if(isWeekday(day))
{
System.out.println(day+": "+"Go to work.");
}
if(isHoliday(day))
{
System.out.println(day+": "+"Stay home and play with your cat.");
}
}
}

public class Main //main class of the program
{
//main method of the program
public static void main (String[]args)
{
Weekday arr[] = Weekday.values(); // Calling values() of the Weekday enum

// enum with loop
for (Weekday day : arr)
{
Weekday.testDay(day); //calling the testDay method for each value
}
}
}
