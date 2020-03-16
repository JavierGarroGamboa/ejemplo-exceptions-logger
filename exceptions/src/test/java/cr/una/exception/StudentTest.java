package cr.una.exception;

import org.junit.Test;

import static org.junit.Assert.fail;

public class StudentTest {

    @Test
    public void testBadlyFormattedName() {
        try {
            new Student("a b c d");
            fail ("expected exception from 4-parts name");
        } catch (StudentNameFormatException sucess){
            // Missing Print Log
        }
    }
}
