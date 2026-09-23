class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
val n = nums.size
        val ans = IntArray(nums.size) { 1 }
        val prefix = IntArray(n)
        val suffix = IntArray(n)
        for (i in 0..<n) {
            prefix[i] = (if (i > 0) prefix[i - 1] else 1) * nums[i]
        }

        for (i in n - 1 downTo 0) {
            suffix[i] = (if (i == n - 1) 1 else suffix[i + 1]) * nums[i]
        }
        for (i in 0 until n) {
            if (i > 0) {
                ans[i] *= prefix[i - 1]
            }
            if (i < n - 1) {
                ans[i] *= suffix[i + 1]
            }
        }
        return ans
    }
}
