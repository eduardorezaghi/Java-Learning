public class TabuleiroPrint {
    public static void tabuleiroPrint() {
        int i=1;
        while(i<=8){
            System.out.printf("%s* * * * * * * *\n", (i % 2 != 0 ? " " : ""));
            i++;
        }
    }
    public static void main(String[] args) 
    {
        TabuleiroPrint.tabuleiroPrint();
    }
}
