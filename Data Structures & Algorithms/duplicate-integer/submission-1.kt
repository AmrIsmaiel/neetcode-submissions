class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val map = HashMap<Int,Int>()
        for (i in nums.indices){
            if(map.contains(nums[i])){
                return true
            }
            map[nums[i]] = i
        }
        return false
    }
}
