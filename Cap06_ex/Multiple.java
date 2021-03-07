public class Multiple {
    static boolean isMultiple(int x, int y)
    {
        if ( x % y == 0 )
            return true;
        else 
            return false;
    }
    public static void main(String[] args) {
        System.out.println("8 é multiplo de 4? " + Multiple.isMultiple(8, 4));
    }
}
