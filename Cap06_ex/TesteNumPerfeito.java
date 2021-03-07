public class TesteNumPerfeito {
    public static boolean isPerfect(int number) 
    {   
        int perfect = 0;
        
        for(int i=1; i<=number; i++)
        {
            if( number % i ==0)
            {
                if(i*i!=number) 
                    perfect += i + number/i; 
                else
                    perfect+= i;
            } 
        }
        if (perfect == number)
            return true;
        return false;
    }
    public static void main(String[] args) 
    {
        int number = 6;
        if (isPerfect(number))
            System.out.println("O número " + number + " é perfeito");
        else
            System.out.println("O número " + number + " não é perfeito");
    }
}
