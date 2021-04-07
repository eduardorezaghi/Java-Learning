// Exercício 8.7: Time2Mod2.java
// Aprimorando a classe Time2 com métodos para incrementar segundo, minuto e hora

public class Time2Mod2
{
    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    // Time2Mod2 no-argument constructor: 
    // initializes each instance variable to zero
    public Time2Mod2()
    {
        this(0, 0, 0); // invoke constructor with three arguments
    }

    // Time2Mod2 constructor: hour supplied, minute and second defaulted to 0
    public Time2Mod2(int hour)
    {
        this(hour, 0, 0); // invoke constructor with three arguments
    }

    // Time2Mod2 constructor: hour and minute supplied, second defaulted to 0
    public Time2Mod2(int hour, int minute)
    {
        this(hour, minute, 0); // invoke constructor with three arguments
    }

    // Time2Mod2 constructor: hour, minute and second supplied
    public Time2Mod2(int hour, int minute, int second)
    {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");

        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");

        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Time2Mod2 constructor: another Time2Mod2 object supplied
    public Time2Mod2(Time2Mod2 time)
    {
        // invoke constructor with three arguments
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    public void tick(){
        second++;
        if (second > 59){
            second = 0;
            incrementMinute();
        }
    }

    public void incrementMinute(){
        minute++;
        if (minute > 59){
            minute = 0;
            incrementHour();
        }
    }

    public void incrementHour(){
        hour++;
        if (hour > 23) {
            hour = 0;
        }
    }

    // Set Methods
    // set a new time value using universal time;

    // validate the data
    public void setTime(int hour, int minute, int second)
    {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");

        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");

        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // validate and set hour 
    public void setHour(int hour)
    {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");

        this.hour = hour;
    }

    // validate and set minute 
    public void setMinute(int minute)
    {
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");

        this.minute = minute;
    }

    // validate and set second 
    public void setSecond(int second)
    {
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        this.second = second;
    }

    // Get Methods
    // get hour value
    public int getHour()
    {
        return hour;
    }

    // get minute value
    public int getMinute()
    {
        return minute;
    }

    // get second value
    public int getSecond()
    {
        return second;
    }

    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString()
    {
        return String.format(
                "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString()
    {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
} // end class Time2Mod2

class Time2Mod2Test
{
    public static void main(String[] args)
    {
        Time2Mod2 t1 = new Time2Mod2(13, 6, 59); // 13:06:59
        Time2Mod2 t2 = new Time2Mod2(13, 59, 59); // 13:59:59
        Time2Mod2 t3 = new Time2Mod2(23, 59, 59); // 23:59:59

        System.out.println("Constructed with:");
        displayTime("t1: hour, minute and second specified", t1);
        displayTime("t2: hour, minute and second specified", t2);
        displayTime("t3: hour, minute and second specified", t3);
        t1.tick();
        t2.incrementHour();
        t3.tick();
        displayTime("t1: after tick", t1);
        displayTime("t2: after incrementHour", t2);
        displayTime("t3: after tick", t3);

    }

    // displays a Time2 object in 24-hour and 12-hour formats
    private static void displayTime(String header, Time2Mod2 t)
    {
        System.out.printf("%s%n   %s%n   %s%n",
                header, t.toUniversalString(), t.toString());
    }
} // end class Time2Mod2Test
