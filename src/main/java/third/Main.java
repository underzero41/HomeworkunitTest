package third;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public boolean evenOddNumber(int number) {
        if (number % 2 == 0) {
            return true; // число четное
        } else {
            return false; // число нечетное
        }
    }

    public boolean numberInInterval(int number) {
        if (number > 25 && number < 100) {
            return true; // число попадает в интервал
        } else {
            return false; // число не попадает в интервал
        }
    }
}