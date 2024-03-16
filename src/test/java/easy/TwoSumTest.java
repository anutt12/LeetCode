package easy;

import org.junit.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoSumTest {

    /**
     * The class to test is `TwoSum`, and the method is `twoSum`.
     * Given an array of integers and a target value, the method should
     * return the indices of two numbers such that they add up to
     * the target value.
     */

    @Test
    public void testTwoSumMethodPositiveScenario() {
        // test data
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // expected result
        int[] expected = {0, 1};

        // actual result
        int[] actual = TwoSum.twoSum(nums, target);

        // assert that the expected result matches the actual result
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }

    @Test
    public void testTwoSumMethodWhenNoSolutionExists() {
        // test data
        int[] nums = {2, 7, 11, 15};
        int target = 50;

        // verify that the method throws an IllegalArgumentException if no solution exists
        assertThrows(IllegalArgumentException.class, () -> TwoSum.twoSum(nums, target));
    }
}