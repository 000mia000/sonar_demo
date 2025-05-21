import java.util.*;
import java.util.logging.*;

public class SampleApp {

    private static final Logger logger = Logger.getLogger(SampleApp.class.getName());

    public static void main(String[] args) {
        String unused = "This is a SonarCloud demo"; // ❗ 未使用變數
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        logger.info("Enter number of names:");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            logger.info("Enter name " + (i + 1) + ": ");
            String name = scanner.nextLine();
            names.add(name);
        }

        for (String name : names) {
            if (name.length() > 3) {
                logger.info(name.toUpperCase());
            } else {
                logger.info(name.toLowerCase());
            }
        }

        for (String name : names) {
            if (name.length() > 3) {
                logger.info(name.toUpperCase());
            } else {
                logger.info(name.toLowerCase());
            }
        }

        String result = process(null);
        logger.info("Processed: " + result);

        scanner.close();
    }

    public static String process(String input) {
        return input.trim(); // ❗ 潛在 null pointer
    }
}
