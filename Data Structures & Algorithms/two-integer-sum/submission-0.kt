class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
   val map = HashMap<Int,Int>()
    for (i in nums.indices) {
        if(map.contains(target-nums[i])){
            return intArrayOf(map[target-nums[i]]!!, i)
        }
        map[nums[i]] = i
    }
    return intArrayOf()
    }
}
