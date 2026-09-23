class Solution {
    fun isAnagram(s: String, t: String): Boolean {
if (s.length != t.length) return false
        val map = HashMap<Char, Int>()
        for (i in s) {
            map[i] = (map[i] ?: 0) + 1
        }
        for (i in t) {
            if (!map.contains(i)) return false
            map[i] = map[i]!! - 1
            if (map[i]!! < 0) return false
        }
        return true
    }
}
