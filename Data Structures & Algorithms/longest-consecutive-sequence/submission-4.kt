class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val set: Set<Int> = nums.toSet()
        var longest = 0
        for (number in set) {
            if (number - 1 !in set) {
                var length = 0
                while (number + length in set) {
                    length += 1
                }
                longest = max(longest, length)
            }
        }
        return longest
    }
}