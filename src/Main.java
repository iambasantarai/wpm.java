import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== uwu ===");
        System.out.println("WPM Calculator!");
        System.out.println("=== uwu ===");
        System.out.println("Type the following words as fast as you can: ");
        System.out.println();

        // words list
        String[] words = {
                "aberration", "benevolent", "cacophony", "debilitate", "ebullient",
                "facetious", "garrulous", "haphazard", "iconoclast", "juxtapose",
                "kaleidoscope", "labyrinthine", "mellifluous", "nomenclature", "obfuscate",
                "parsimonious", "quixotic", "recalcitrant", "serendipity", "taciturn",
                "ubiquitous", "vivacious", "wanderlust", "xenophobia", "yesterday",
                "zeitgeist", "alacrity", "belligerent", "circumlocution", "deleterious",
                "ephemeral", "furtive", "gregarious", "histrionic", "idiosyncrasy",
                "jettison", "kowtow", "languid", "magnanimous", "nihilism",
                "obsequious", "paucity", "quagmire", "reprobate", "sycophant",
                "trepidation", "ubiquity", "voracious", "winsome", "xerophyte",
                "yearning", "zealous", "alleviate", "benevolence", "candor",
                "delineate", "effulgent", "fledgling", "garrulity", "halcyon",
                "iconoclasm", "jocularity", "kaleidoscopic", "lamentation", "mellowness",
                "nocturnal", "obstinate", "paradoxical", "querulous", "rhapsody",
                "salubrious", "taciturnity", "ubiquitarian", "vociferous", "whimsical",
                "xenophobe", "yesteryear", "zealotry"
        };

        // generate 10 random words
        StringBuilder randomWords = new StringBuilder();

        Random random = new Random();
        int numberOfWords = 10;
        for (int i = 0; i < numberOfWords; i++) {
            randomWords.append(words[random.nextInt(words.length)]);
            if(i < numberOfWords - 1) {
                randomWords.append(" ");
            }
        }

        // print random words
        System.out.println(randomWords.toString());

        System.out.println();
        System.out.println("Press enter to start typing...");

        double startTime = System.currentTimeMillis();

        String userTypedWords = sc.nextLine();
        double endTime = System.currentTimeMillis();
        double elapsedTimeInSeconds = (endTime - startTime) / 1000.0;

        // calculate wpm
        int numberOfWordsTyped = userTypedWords.split("\\s+").length;
        int wpm = (int) Math.round( numberOfWordsTyped / (elapsedTimeInSeconds / 60.0));

        // count spelling mistakes
        String[] correctWords = randomWords.toString().split("\\s+");
        String[] inputWords = userTypedWords.split("\\s+");
        int spellingMistakes = 0;

        for (int i = 0; i < correctWords.length && i < inputWords.length; i++) {
            if(!correctWords[i].equals(inputWords[i])) {
                spellingMistakes++;
            }
        }

        System.out.println("Your typing speed is approximately " + wpm + " WPM.");
        System.out.println();
        System.out.println("SPELLING MISTAKES: " + spellingMistakes);
        sc.close();
    }
}