// Exercício 4.16: Mystery.java
public class Mystery
{
public static void main(String[] args)
{
int x = 1;
int total = 0;
while (x <= 10)
{
int y = x * x;
System.out.println(y);
total += y;
++x;
}
System.out.printf("Total is %d%n", total);
}
} // fim da classe Mystery
