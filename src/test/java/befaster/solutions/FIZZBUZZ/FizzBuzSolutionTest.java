package befaster.solutions.FIZZBUZZ;

import befaster.solutions.FIZ.FizzBuzzSolution;
import befaster.solutions.SUM.SumSolution;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzSolutionTest {

    private FizzBuzzSolution fizzBuzzSolution;

    @Before
    public void setUp() {

        fizzBuzzSolution = new FizzBuzzSolution();
    }

    @Test
    @Ignore
    public void multiple_of_Neither_3_and_5() {
        assertThat(fizzBuzzSolution.fizzBuzz(1), equalTo("1"));
    }

    @Test
    @Ignore
    public void multiple_of_3_and_5() {
        assertThat(fizzBuzzSolution.fizzBuzz(15), equalTo("fizz buzz"));
        assertThat(fizzBuzzSolution.fizzBuzz(30), equalTo("fizz buzz"));
        assertThat(fizzBuzzSolution.fizzBuzz(45), equalTo("fizz buzz"));
        assertThat(fizzBuzzSolution.fizzBuzz(60), equalTo("fizz buzz"));
        assertThat(fizzBuzzSolution.fizzBuzz(150), equalTo("fizz buzz"));
        assertThat(fizzBuzzSolution.fizzBuzz(9990), equalTo("fizz buzz"));
    }

    @Test
    @Ignore
    public void multiple_of_3() {
        assertThat(fizzBuzzSolution.fizzBuzz(3), equalTo("fizz"));
        assertThat(fizzBuzzSolution.fizzBuzz(6), equalTo("fizz"));
        assertThat(fizzBuzzSolution.fizzBuzz(9), equalTo("fizz"));
        assertThat(fizzBuzzSolution.fizzBuzz(9999), equalTo("fizz"));
    }

    @Test
    @Ignore
    public void multiple_of_5() {
        assertThat(fizzBuzzSolution.fizzBuzz(5), equalTo("buzz"));
        assertThat(fizzBuzzSolution.fizzBuzz(10), equalTo("buzz"));
        assertThat(fizzBuzzSolution.fizzBuzz(20), equalTo("buzz"));
        assertThat(fizzBuzzSolution.fizzBuzz(25), equalTo("buzz"));
        assertThat(fizzBuzzSolution.fizzBuzz(9995), equalTo("buzz"));
    }
}
