package befaster.solutions.FIZZBUZZ;

import befaster.solutions.FIZ.FizzBuzzSolution;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzSolution2Test {

    private FizzBuzzSolution fizzBuzzSolution;

    @Before
    public void setUp() {

        fizzBuzzSolution = new FizzBuzzSolution();
    }

    @Test
    public void multiple_of_Neither_3_and_5() {
        assertThat(fizzBuzzSolution.fizzBuzz(1), equalTo("1"));
    }

    @Test
    public void multiple_of_3_and_5() {
        assertThat(fizzBuzzSolution.fizzBuzz(546), equalTo("fizz buzz"));
/*        assertThat(fizzBuzzSolution.fizzBuzz(9953), equalTo("fizz buzz"));
        assertThat(fizzBuzzSolution.fizzBuzz(9935), equalTo("fizz buzz"));*/
    }

    @Test
    public void multiple_of_3() {
        assertThat(fizzBuzzSolution.fizzBuzz(3), equalTo("fizz"));
        assertThat(fizzBuzzSolution.fizzBuzz(6), equalTo("fizz"));
        assertThat(fizzBuzzSolution.fizzBuzz(9), equalTo("fizz"));
        assertThat(fizzBuzzSolution.fizzBuzz(31), equalTo("fizz"));
        assertThat(fizzBuzzSolution.fizzBuzz(9999), equalTo("fizz deluxe"));
    }

    @Test
    public void multiple_of_5() {
        assertThat(fizzBuzzSolution.fizzBuzz(5), equalTo("buzz"));
        assertThat(fizzBuzzSolution.fizzBuzz(10), equalTo("buzz"));
        assertThat(fizzBuzzSolution.fizzBuzz(20), equalTo("buzz"));
        assertThat(fizzBuzzSolution.fizzBuzz(25), equalTo("buzz"));
        assertThat(fizzBuzzSolution.fizzBuzz(52), equalTo("buzz"));
        assertThat(fizzBuzzSolution.fizzBuzz(9995), equalTo("buzz"));
    }

    @Test
    public void deluxeTest() {
        assertThat(fizzBuzzSolution.fizzBuzz(77), equalTo("deluxe"));
        assertThat(fizzBuzzSolution.fizzBuzz(55), equalTo("buzz deluxe"));
        assertThat(fizzBuzzSolution.fizzBuzz(33), equalTo("fizz deluxe"));
    }

    @Test
    public void deluxeFakeTest() {
        assertThat(fizzBuzzSolution.fizzBuzz(77), equalTo("fake deluxe"));
        assertThat(fizzBuzzSolution.fizzBuzz(666), equalTo("fizz deluxe"));
        assertThat(fizzBuzzSolution.fizzBuzz(555), equalTo("buzz fake deluxe"));
        assertThat(fizzBuzzSolution.fizzBuzz(444), equalTo("deluxe"));
        assertThat(fizzBuzzSolution.fizzBuzz(33), equalTo("fizz fake deluxe"));
    }
}
