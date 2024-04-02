package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumWealthTest {

    /**
     * Testing the maximumWealth method in the MaximumWealth class.
     * The method sums all the elements in a 2-d array and compares the sum to the
     * previously highest sum. The function should then return the highest sum found.
     */
    @Test
    void testMaximumWealthCase1() {
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        assertEquals(10, MaximumWealth.maximumWealth(accounts));
    }

    @Test
    void testMaximumWealthCase2() {
        int[][] accounts = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        assertEquals(17, MaximumWealth.maximumWealth(accounts));
    }

    @Test
    void testMaximumWealthWhenNextPersonWealthHigher() {
        int[][] accounts = {{1, 3}, {2, 5}, {6, 3}};
        assertEquals(9, MaximumWealth.maximumWealth(accounts));
    }

    @Test
    void testMaximumWealthWhenOnePersonWealthLower() {
        int[][] accounts = {{1, 3}, {5, 5}, {2, 3}};
        assertEquals(10, MaximumWealth.maximumWealth(accounts));
    }

    @Test
    void testMaximumWealthWhenAllWealthSame() {
        int[][] accounts = {{2, 2}, {2, 2}, {2, 2}};
        assertEquals(4, MaximumWealth.maximumWealth(accounts));
    }
}