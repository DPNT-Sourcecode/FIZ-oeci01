package befaster.solutions.FIZZBUZZ;

import befaster.solutions.FIZ.FizzBuzzSolution;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzSolution5Test {

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
        assertThat(fizzBuzzSolution.fizzBuzz(60), equalTo("fizz buzz"));
        assertThat(fizzBuzzSolution.fizzBuzz(45), equalTo("fizz buzz fake deluxe"));
        assertThat(fizzBuzzSolution.fizzBuzz(30), equalTo("fizz buzz deluxe"));

/*        assertThat(fizzBuzzSolution.fizzBuzz(9953), equalTo("fizz buzz"));
        assertThat(fizzBuzzSolution.fizzBuzz(9935), equalTo("fizz buzz"));*/
    }

    @Test
    public void multiple_of_3() {
        assertThat(fizzBuzzSolution.fizzBuzz(3), equalTo("fizz fake deluxe"));
        assertThat(fizzBuzzSolution.fizzBuzz(6), equalTo("fizz"));
        assertThat(fizzBuzzSolution.fizzBuzz(9), equalTo("fizz"));
        assertThat(fizzBuzzSolution.fizzBuzz(31), equalTo("31"));
        assertThat(fizzBuzzSolution.fizzBuzz(9999), equalTo("fizz"));
    }

    @Test
    public void multiple_of_5() {
        assertThat(fizzBuzzSolution.fizzBuzz(5), equalTo("buzz fake deluxe"));
        assertThat(fizzBuzzSolution.fizzBuzz(10), equalTo("buzz"));
        assertThat(fizzBuzzSolution.fizzBuzz(20), equalTo("buzz"));
        assertThat(fizzBuzzSolution.fizzBuzz(25), equalTo("buzz fake deluxe"));
        assertThat(fizzBuzzSolution.fizzBuzz(52), equalTo("52"));
        assertThat(fizzBuzzSolution.fizzBuzz(9990), equalTo("fizz buzz"));
    }

    @Test
    public void deluxeTest() {
        assertThat(fizzBuzzSolution.fizzBuzz(36), equalTo("fizz deluxe"));
        assertThat(fizzBuzzSolution.fizzBuzz(55), equalTo("buzz fake deluxe"));
        assertThat(fizzBuzzSolution.fizzBuzz(33), equalTo("fizz fake deluxe"));
    }
}
