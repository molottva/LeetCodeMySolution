package com.leetcode;

/*Write a function to find the longest common prefix string amongst an array of strings.

        If there is no common prefix, return an empty string "".

        Example 1:
        Input: strs = ["flower","flow","flight"]
        Output: "fl"

        Example 2:
        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.

        Constraints:
        1 <= strs.length <= 200
        0 <= strs[i].length <= 200
        strs[i] consists of only lowercase English letters.*/
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = strs[0].length() - 1; i < j; j--) {
                for (int q = 1; q < strs.length; q++) {
                    if (strs[q].contains(strs[0].substring(i, j))) {
                        if (q == strs.length) {
                            return strs[0].substring(i, j);
                        }
                    }
                }
            }
        }
        return "";
    }
}
