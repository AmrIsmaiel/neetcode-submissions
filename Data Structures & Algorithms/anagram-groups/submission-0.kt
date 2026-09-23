class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
if (strs.size == 1) return listOf(listOf(strs[0]))
        val map = HashMap<String, MutableList<String>>()
        for (word in strs) {
            val key = word.toCharArray().sorted().joinToString("")
            if (!map.contains(key)) {
                map[key] = mutableListOf()
            }
            map[key]!!.add(word)
        }
        return map.values.toList()
    }
}
