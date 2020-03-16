package cr.una.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Scorer {

    private static final Logger logger = LogManager.getLogger(Scorer.class);

    public int score(String input) {
        logger.debug("Hello from Log4j 2");
        return Integer.parseInt(input);
    }

    public boolean isValid(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
