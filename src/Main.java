import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== uwu ===");
        System.out.println("WPM Calculator!");
        System.out.println("=== uwu ===");
        System.out.println("Type the following random words as fast as you can: ");

        // words
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
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.print(words[random.nextInt(words.length)] + " ");
        }
        System.out.println();
        System.out.println("Press enter to start typing...");

        double startTime = System.currentTimeMillis();

        String userTypedWords = sc.nextLine();
        double endTime = System.currentTimeMillis();
        double elapsedTimeInSeconds = (endTime - startTime) / 1000.0;

        // calculate wpm
        int numberOfWordsTyped = userTypedWords.split("\\s+").length;
        int wpm = (int) Math.round( numberOfWordsTyped / (elapsedTimeInSeconds / 60.0));

        System.out.println("Your typing speed is approximately " + wpm + " WPM.");
        sc.close();
    }
}