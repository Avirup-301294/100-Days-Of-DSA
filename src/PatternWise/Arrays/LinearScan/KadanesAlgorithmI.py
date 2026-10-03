# Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.
# A subarray is a contiguous non-empty sequence of elements within an array.

# Example 1:
# Input: nums = [2, 3, 5, -2, 7, -4]
# Output: 15
# Explanation: The subarray from index 0 to index 4 has the largest sum = 15

# Example 2:
# Input: nums = [-2, -3, -7, -2, -10, -4]
# Output: -2
# Explanation: The element on index 0 or index 3 make up the largest sum when taken as a subarray

from math import inf
from typing import List
class KadanesAlgorithm:
    def maxSubArray(self, nums: List) -> int:
        max_sum = float(-inf)
        sum = 0
        for num in nums:
            sum += num
            if sum > max_sum:
                max_sum = sum
            if sum < 0:
                sum = 0
        return max_sum

if __name__ == "__main__":
    kadanes_algorithm = KadanesAlgorithm()

    nums1 = [2, 3, 5, -2, 7, -4]
    maxSum1 = kadanes_algorithm.maxSubArray(nums1)
    print(f"The maximum subarray sum is: {maxSum1}")

    nums2 = [-2, -3, -7, -2, -10, -4]
    maxSum2 = kadanes_algorithm.maxSubArray(nums2)
    print(f"The maximum subarray sum is: {maxSum2}")
