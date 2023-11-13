import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import seminars.third.hw.MainHW;


public class NumTest {

    //Напишите тесты, покрывающие на 100% метод, который проверяет, является ли переданное число четным или нечетным

    @ParameterizedTest
    @ValueSource(ints = { 4, 64, 22, 6, 312, 244 })
    public void evenOddNumber(int number) {
        Assertions.assertTrue(MainHW.isEven(number));
    }


    @Test
    public void testIsEvenWithEvenNumber() {
        int number = 10;
        Assertions.assertTrue(MainHW.isEven(number));
    }

    @Test
    public void testIsEvenWithOddNumber() {
        int number = 7;
        Assertions.assertFalse(MainHW.isEven(number));
    }



    // Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли переданное число в интервал (25;100)

    @ParameterizedTest
    @ValueSource(ints = { 26, 40, 54, 77, 99 })
    public void numberInInterval(int number) {
        Assertions.assertTrue(MainHW.numberInInterval(number));
    }

    @Test
    public void testIsInRangeWithNumberInRange() {
        int number = 50;
        Assertions.assertTrue(MainHW.numberInInterval(number));
    }

    @Test
    public void testIsInRangeWithNumberBelowRange() {
        int number = 10;
        Assertions.assertFalse(MainHW.numberInInterval(number));
    }

    @Test
    public void testIsInRangeWithNumberAboveRange() {
        int number = 150;
        Assertions.assertFalse(MainHW.numberInInterval(number));
    }


}

