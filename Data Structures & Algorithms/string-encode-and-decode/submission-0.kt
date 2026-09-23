class Solution {

    fun encode(strs: List<String>): String {
        var result = ""
        for (char in strs) {
            result += "${char.length}" + "#" + char
        }
        return result
    }

    fun decode(str: String): List<String> {
        val result = mutableListOf<String>()
        var i = 0
        while (i < str.length) {
            var j = i
            while (str[j] != '#') {
                j += 1
            }
            val length = str.slice(i until j).toInt()
            result.add(str.slice(j + 1 until j +1+ length))
            i = j + 1 + length
        }
        return result
    }
}
