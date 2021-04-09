// Exercício. 8.8: Aprimorando Date.java 
// Adicionado verificação de ano negativo e método nextDay().

public class Date {
   private int month; // 1-12
   private int day; // 1-31 based on month
   private int year; // any year

   private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

   // constructor: confirm proper value for month and day given the year
   public Date(int month, int day, int year) {
      // check if month in range
      if (month <= 0 || month > 12)
         throw new IllegalArgumentException("month (" + month + ") must be 1-12");

      // check if day in range for month
      if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
         throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");

      // check for leap year if month is 2 and day is 29
      if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
         throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");

      if (year < 0)
         throw new IllegalArgumentException("year (" + year + ") greather than zero");

      this.month = month;
      this.day = day;
      this.year = year;

      System.out.printf("Date object constructor for date %s%n", this);
   }

   public void nextDay() {
      if (day == 28 && month == 2 && year % 4 == 0 && year % 100 != 0)
         day++;

      if (day == daysPerMonth[month]) {
         day = 1;
         month++;
      }

      if (month > 12) {
         month = 1;
         year++;
      }
   }

   // return a String of the form month/day/year
   public String toString() {
      return String.format("%d/%d/%d", month, day, year);
   }
} // end class Date

// Caso de teste para a classe Date
class DateTest {
   public static void main(String args[]) {
      Date day1 = new Date(4, 30, 1999); // Novo mês
      Date day2 = new Date(12, 31, 1999); // Novo ano
      Date day3 = new Date(2, 28, 2004); // Testa ano bissexto

      // Incrementa day por um
      day1.nextDay();
      day2.nextDay();
      day3.nextDay();

      // Mostra novo valor para os objetos day
      System.out.printf("%nDates incremented by 1: %n");
      System.out.printf("Date 1: %s%nDate 2: %s%nDate 3: %s%n", day1, day2, day3);
   }

} // end class DateTest