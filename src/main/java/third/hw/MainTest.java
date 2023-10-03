package third.hw;

import org.testng.annotations.Test;
import third.Main;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class MainTest {

    //задача1
    @Test
    public void testEvenNumber() {
        Main main = new Main();
        assertTrue(main.evenOddNumber(2));
    }

    @Test
    public void testOddNumber() {
        Main main = new Main();
        assertFalse(main.evenOddNumber(3));
    }


    //задача2

    @Test
    public void testNumberInRange() {
        Main main = new Main();
        assertTrue(main.numberInInterval(50));
    }

    @Test
    public void testNumberOutOfRange() {
        Main main = new Main();
        assertFalse(main.numberInInterval(120));
    }

    @Test
    public void testNumberOnLowerBoundary() {
        Main main = new Main();
        assertFalse(main.numberInInterval(25));
    }

    @Test
    public void testNumberOnUpperBoundary() {
        Main main = new Main();
        assertFalse(main.numberInInterval(100));
    }

    //задача3
}
