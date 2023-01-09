// Exercise 14.5: StringRandomSentences.java
/* 
*   Build random strings based on static arrays of articles, nouns, verbs, etc.
*/

import java.security.SecureRandom;
import java.util.ArrayList;

public class StringRandomSentences {
    static String artigos[] = {"the", "a", "one", "some", "any"};
    static String substantivos[] = {"boy", "girl", "dog", "town", "car"};
    static String verbos[] = {"drove", "jumped", "ran", "walked", "skipped"};
    static String preposicoes[] = {"to", "from" , "over", "under", "on"};

    static final int PHRASES_QUANTITY = 20;
    static final int ARRAY_SIZES = 5;

    public static void main(String[] args) {
        ArrayList<StringBuilder> phrases = new ArrayList<StringBuilder>();
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < PHRASES_QUANTITY; i++) {
            StringBuilder phrase = new StringBuilder();
            int rnd = random.nextInt(0, ARRAY_SIZES-1);

            StringBuilder capitalize = new StringBuilder(
                artigos[rnd]
                .substring(0, 1)
                .toUpperCase()
                + artigos[rnd].substring(1)
            );

            phrase.append(capitalize).append(' ');
            phrase.append(substantivos[random.nextInt(0, ARRAY_SIZES-1)]).append(' ');
            phrase.append(verbos[random.nextInt(0, ARRAY_SIZES-1)]).append(' ');
            phrase.append(preposicoes[random.nextInt(0, ARRAY_SIZES-1)]).append(' ');
            phrase.append(artigos[random.nextInt(0, ARRAY_SIZES-1)]).append(' ');
            phrase.append(substantivos[random.nextInt(0, ARRAY_SIZES-1)]).append(' ');
            phrases.add(i, phrase);
        }
        
        for (StringBuilder phrase : phrases) {
            System.out.println(phrase);
        }
    }
}
