class Solution {
    fun isValid(s: String): Boolean {
val input = Stack<Char>()
        val pairs = hashMapOf(
            '(' to ')',
        '[' to ']',
        '{' to '}'
        )
        if (s.length % 2 != 0) return false
        for (char in s) {
            if (pairs.containsKey(char)){
                input.push(char)
            } else {
                if (input.isEmpty()) return false
                if (pairs[input.removeLast()] != char) return false
            }
        }
        return input.isEmpty()
    }
}
