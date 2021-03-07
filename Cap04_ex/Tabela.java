public class Tabela {
    public static void main(String[] args) {
        int i = 1;
        System.out.printf("N\t10*N\t100*N\t1000*N%n");
        while (i <= 5){
            System.out.printf("%d\t%d\t%d\t%d%n",i,10*i,100*i,1000*i);
            i++;
		}
    }
}
