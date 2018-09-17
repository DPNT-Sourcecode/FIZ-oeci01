package befaster.solutions.Hello;

import befaster.solutions.HLO.HelloSolution;
import befaster.solutions.SUM.SumSolution;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class HelloSolutionTest {

    private HelloSolution helloSolution;

    @Before
    public void setUp() {

        helloSolution = new HelloSolution();
    }

    @Test
    public void compute_sum_Initial_Range() {
        assertThat(helloSolution.hello("ahmad"), equalTo("Hello, World!"));
    }


}
