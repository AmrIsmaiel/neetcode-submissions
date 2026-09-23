class Solution {
    fun longestConsecutive(nums: IntArray): Int {
val set: Set<Int> = nums.toSet()
        var longest = 0
        for (number in nums) {
            if (number - 1 !in nums) {
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
