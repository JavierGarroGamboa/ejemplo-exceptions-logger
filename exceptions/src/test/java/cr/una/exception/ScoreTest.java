package cr.una.exception;

import org.junit.Test;

import static org.junit.Assert.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ScoreTest {

    private static final Logger logger = LogManager.getLogger(ScoreTest.class);

    @Test
    public void testCaptureScore() {
        Scorer scorer = new Scorer();
        assertEquals(75, scorer.score("75"));
    }

    @Test
    public void testBadScoreEntered() {
        Scorer scorer = new Scorer();
        try {
            scorer.score("abd");
            fail("expected NumberFormatException on bad input");
        } catch (NumberFormatException success) {
            logger.error("Mensaje de error: ", success);
        }

    }

    @Test
    public void testIsValid() {
        Scorer scorer = new Scorer();

        assertTrue(scorer.isValid("75"));
        assertFalse(scorer.isValid("base"));
    }

}
