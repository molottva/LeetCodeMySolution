package com.leetcode;

import org.junit.jupiter.api.Test;

public class Tests {
    @Test
    public void test() {
        TwoSum test = new TwoSum();
        int[] result = test.twoSum(new int[]{3,3}, 6);
        System.out.println(result);
    }
}
