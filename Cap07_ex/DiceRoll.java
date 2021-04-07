import java.security.SecureRandom;

public class DiceRoll {
    private static void rollTwoDices(int times){
        SecureRandom rng = new SecureRandom();
        int[] frequency = new int[13];

        for (int roll = 1; roll < times; roll++) {
            int sum = (1 + rng.nextInt(6)) + ( 1 + rng.nextInt(6));
            switch (sum) {
                case 2:
                    ++frequency[2];
                    break;
                case 3:
                    ++frequency[3];
                    break;
                case 4:
                    ++frequency[4];
                    break;
                case 5:
                    ++frequency[5];
                    break;
                case 6:
                    ++frequency[6];
                    break;
                case 7:
                    ++frequency[7];
                    break;
                case 8:
                    ++frequency[8];
                    break;
                case 9:
                    ++frequency[9];
                    break;
                case 10:
                    ++frequency[10];
                    break;
                case 11:
                    ++frequency[11];
                    break;
                case 12:
                    ++frequency[12];
                    break;
            }
        }

        System.out.printf("%13s\tFrequência%n",
        "Valor da soma");
        
        for (int i = 2; i < frequency.length; i++) {
            System.out.printf("%11s%d:\t%d%n",
            "Soma ",i, frequency[i]);
        }
    }
    public static void main(String[] args) {
        rollTwoDices(36000);
    }
}
