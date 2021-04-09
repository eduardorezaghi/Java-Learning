// Exercício 8.8
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
}