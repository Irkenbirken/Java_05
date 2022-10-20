import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzTest {

/*   1. Positive testing Happy pass
       if (start <= end)
        return arrFizBuz;  */

/*   start < end  */
    @Test
    public void testStartLessThanEnd_Positive() {

/*       AAA      */

        /*  arrange  */

        int start = 1;
        int end = 20;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz",
                "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};

        /*  act  */

/*  1st option  */

/*      FizzBuzz fizzBuzz = new FizzBuzz();
        String [] actualResult = fizzBuzz.fizzBuzz(start, end);  */

/*  2st option  */

        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        /*  assert  */

        Assert.assertEquals(actualResult, expectedResult);
    }

    /*  start == end  */
        @Test
        public void testStartEqualsEnd_Positive() {

            int start = 1;
            int end = 1;
            String [] expectedResult = {"1"};

            String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

            Assert.assertEquals(actualResult, expectedResult);
    }

    /*  start < end  */
    @Test
    public void testStartLessThanEnd_StartEndAreNegative_Positive() {

        int start = -20;
        int end = -1;
        String[] expectedResult = {"Buzz", "-19", "Fizz", "-17", "-16", "FizzBuzz", "-14", "-13",
                "Fizz", "-11", "Buzz", "Fizz", "-8", "-7",
                "Fizz", "Buzz", "-4", "Fizz", "-2", "-1"};

        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /*2. Negative testing
      if (start > end)
                  return new String{0}*/

    /*  start > end  */
    @Test
    public void testStartGreaterThanEnd_Negative() {

        int start = 2;
        int end = 1;
        String [] expectedResult = {};

        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
