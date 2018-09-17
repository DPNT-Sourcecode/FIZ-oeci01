package befaster.solutions.SUM;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumSolutionTest {
    private SumSolution sum;

    @Before
    public void setUp() {

        sum = new SumSolution();
    }

    @Test
    public void compute_sum_Initial_Range() {
        assertThat(sum.compute(1, 1), equalTo(2));
    }

    @Test
    public void compute_sum_Final_Range() {
        assertThat(sum.compute(100, 100), equalTo(200));
    }
}
