package easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RunningSumTest {

  // Testing the runningSum method in the RunningSum class.
  // This method takes an array of integers and returns a new array where each element i is the sum of all the numbers in the original array up to i.
  @Test
  void whenNormalArrayThenCorrect() {
    int[] nums = {1, 2, 3, 4};
    int[] expected = {1, 3, 6, 10};
    assertArrayEquals(expected, RunningSum.runningSum(nums));
  }

  @Test
  void whenEmptyArrayThenEmpty() {
    int[] nums = {};
    int[] expected = {};
    assertArrayEquals(expected, RunningSum.runningSum(nums));
  }

  @Test
  void whenSingleElementArrayThenSameArray() {
    int[] nums = {1};
    int[] expected = {1};
    assertArrayEquals(expected, RunningSum.runningSum(nums));
  }
  
}