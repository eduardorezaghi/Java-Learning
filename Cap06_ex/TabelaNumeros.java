public class TabelaNumeros 
{

    public static void main(String[] args) 
    {
        System.out.printf("Tabela contendo números decimais no intervalo 1-256, convertidos para binário, octal e hexadecimal%n");
        System.out.printf("Num. Dec.\tBinário\t\t\tOctal\tHex.%n");

        for (int decNumber = 1; decNumber <= 256; decNumber++) 
            System.out.printf("%9d\t%s\t\t\t%7o\t%4X%n",decNumber,Integer.toBinaryString(decNumber),decNumber,decNumber);  
    }
}
