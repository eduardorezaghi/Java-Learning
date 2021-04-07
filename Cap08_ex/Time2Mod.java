// Exercício 8.5 - Classe Time2Mod & Time2ModTest
// Modificação dos dados internos da classe Time2
public class Time2Mod{
   private int hour;
   private int minute;
   private int second;
   private long seconds; 

   public Time2Mod()
   {
      this(0, 0, 0); 
   } 

   public Time2Mod(int hour) 
   { 
      this(hour, 0, 0); 
   } 

   public Time2Mod(int hour, int minute) 
   { 
      this(hour, minute, 0); 
   }

   public Time2Mod(long onlySeconds)
   {
      int remainingSeconds;
      seconds = onlySeconds;
      hour = (int) (onlySeconds / 3600);
      remainingSeconds = (int) (onlySeconds % 3600);
      minute = (int) (remainingSeconds / 60);
      remainingSeconds = (int) (remainingSeconds % 60);
      second = remainingSeconds;
   }
   
   public Time2Mod(int hour, int minute, int second) 
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

   
   public Time2Mod(Time2Mod time)
   {
      this(time.getHour(), time.getMinute(), time.getSecond());
   } 

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
   
   public void setHour(int hour) 
   { 
      if (hour < 0 || hour >= 24)
         throw new IllegalArgumentException("hour must be 0-23");

      this.hour = hour;
   } 

   public void setMinute(int minute) 
   { 
      if (minute < 0 || minute >= 60)
         throw new IllegalArgumentException("minute must be 0-59");

      this.minute = minute; 
   } 

   
   public void setSecond(int second) 
   { 
      if (second < 0 || second >= 60)
         throw new IllegalArgumentException("second must be 0-59");

      this.second = second; 
   } 

   public int getHour() 
   { 
      return hour; 
   } 

   
   public int getMinute() 
   { 
      return minute; 
   } 

   
   public int getSecond() 
   { 
      return second; 
   } 

   
   public String toUniversalString()
   {
      return String.format(
         "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
   } 

   
   public String toString()
   {
      return String.format("%d:%02d:%02d %s", 
         ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
         getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
   } 
}

class Time2ModTest 
{
   public static void main(String[] args)
   {
      Time2Mod t1 = new Time2Mod(); // 00:00:00
      Time2Mod t2 = new Time2Mod(2); // 02:00:00
      Time2Mod t3 = new Time2Mod(21, 34); // 21:34:00
      Time2Mod t4 = new Time2Mod(12, 25, 42); // 12:25:42
      Time2Mod t5 = new Time2Mod(t4); // 12:25:42
      Time2Mod t6 = new Time2Mod((long) 8540);

      System.out.println("Constructed with:");
      displayTime("t1: all default arguments", t1);
      displayTime("t2: hour specified; default minute and second", t2);
      displayTime("t3: hour and minute specified; default second", t3);
      displayTime("t4: hour, minute and second specified", t4);
      displayTime("t5: Time2Mod object t4 specified", t5);
      displayTime("t6: Time2Mod with seconds specified", t6);

      // attempt to initialize t6 with invalid values
      try
      {
         Time2Mod t7 = new Time2Mod(27, 74, 99); // invalid values
      } 
      catch (IllegalArgumentException e)
      {
         System.out.printf("%nException while initializing t6: %s%n",
            e.getMessage());
      } 
   } 

   // displays a Time2Mod object in 24-hour and 12-hour formats
   private static void displayTime(String header, Time2Mod t)
   {
      System.out.printf("%s%n   %s%n   %s%n",
         header, t.toUniversalString(), t.toString());
   } 
} // end class Time2Mod2Test