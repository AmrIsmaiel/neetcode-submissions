class Solution {
    fun isPalindrome(s: String): Boolean {
val filtered = s.filter { it.isLetterOrDigit() }.lowercase()
        var left = 0
        var right = filtered.length - 1
        while (left < right) {
            if (filtered[left] != filtered[right]) {
                return false
            }
            left++
            right--
        }
        return true
    }
}
